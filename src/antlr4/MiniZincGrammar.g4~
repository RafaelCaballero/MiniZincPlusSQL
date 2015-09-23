grammar MiniZincGrammar;
import MiniZincLexer;
model: (stat ';')+;
stat: table  // SQL table declaration
    | constraint
    | decl
    | solve
    | output
    | predicate
    | function
    | include
    | init
    ;  

decl : vardecl | pardecl;
vardecl : (var | vararray) ('=' expr)?;
pardecl : parameter | pararray;

// this is not MiniZinc standard!
table: 'table' ID '=' string;


constraint : 'constraint'  expr;
var : varmark typename ':'  ID ;
output :'output' '(' listExpr ')' | 'output'  listExpr ;
solve : 'solve' (annotation)? (satisfy | optimize);
parameter : 'par'? typename ':'  ID ('=' expr)?;
include : 'include' stringExpr;
init : ID '=' expr;


// predicates and functions
predicate : 'predicate' ID'(' (decl(','decl)*)? ')' '=' expr;
function : 'function' varmark? qualName '(' (decl(','decl)*)? ')' '=' expr;
qualName : ID |  ID':'opOrID | opOrID extendsmark opOrID;
varmark : 'var';
extendsmark : 'extends';
opOrID : op | ID;

satisfy : 'satisfy';
optimize : maximize | minimize;
maximize : 'maximize' expr;
minimize : 'minimize' expr;

// annotations
annotation : '::' modeAnnotation;
modeAnnotation : intS | boolS | setS | seqS;
intS  : 'int_search'  restS;
boolS : 'bool_search' restS;
setS  : 'set_search'  restS;
seqS  : 'seq_search' '('? '[' modeAnnotation (','modeAnnotation)* ']'')'?;
restS : '(' expr ',' varchoice ',' constrainchoice ',' 'complete' ')';
varchoice : 'input_order' | 'first_fail' | 'smallest';
constrainchoice: 'indomain'
      | 'indomain_min' 
      | 'indomain_median' 
      | 'indomain_random' 
      | 'indomain_split';

constr: scons | tcons;
scons: ID ;
tcons: ID '('typename (','typename)*')' ;


typename : rint
         | rbool
         | rfloat 
         | ID		// for extension types or sets as ranges
         | typedata
         | range
         | typeset
          ;
typeset : 'set' 'of' typename;
vararray : 'array' dimensions 'of' var;
pararray : 'array' dimensions 'of'  parameter;
dimensions : '[' ((range  (','range)*) | 'int') ']';


typedata : ID'('arithExpr')';

expr:  
     ID
    | '_'
    | BOOL
    | real
    | integer
    | predOrUnionExpr 
    | rbracketExpr
    | ifExpr 
    | letExpr 
    | listExpr
    | boolComplexExpr
    | arithComplexExpr
    | setExpr        
    | expr infixOp expr
       ;


boolVal : 
      | '(' boolExpr ')'
      | ID 
      | BOOL 
      | arrayaccess 
      | ifExpr 
      | letExpr 
      | predOrUnionExpr 
      | qualified
      ;

op : boolOp | arithOp;
boolOp : '/\\'|'\\/'| 'xor'| '->'|'<-'|'<->' | '=' | '==' | '!=' ;
arithOp:'<'|'>' |'>=' | '<=' | '=' | '==' | '!=' | 'in' | 'like';
arithOp2 : '*'|'/'| 'div'| 'mod' | '+'|'-';
qualBoolOp  : ID ':' boolOp;
qualArithOp : ID ':' arithOp;

boolComplexExpr:
boolExpr (boolOp|qualBoolOp) boolExpr
| arithExpr (arithOp|qualArithOp) arithExpr
| notExpr
;

boolExpr :      
     boolExpr (boolOp|qualBoolOp) boolExpr     
    |   arithExpr (arithOp|qualArithOp) arithExpr
    |   notExpr  
    |   boolVal
    ;

operand : ID    
    | integer 
    | real
    | string
    |  arrayaccess 
    | ifExpr 
    | letExpr 
    |  '('arithExpr ')'
    | predOrUnionExpr 
    | qualified  // for  
    ;

qualified : 
     ID '.' ID 
    | arrayaccess '.' ID 
    ;


arithComplexExpr :
minusExpr
| arithExpr arithOp2 arithExpr
;
   
arithExpr : 
         minusExpr
    |   arithExpr arithOp2 arithExpr   
    |   operand
   ;


notExpr        : 'not'  expr ;
minusExpr      :  '-'  arithExpr ;

predOrUnionExpr: ID (twosections | onesection) ;
onesection :  '('(expr (','expr)*)?')';
twosections : '(' guard ')' '(' expr ')';


rbracketExpr    :  '(' expr ')';
idexpr : ID;
stringExpr :  string  ;
infixOp : '`' ID  '`' | infixSetOp;
infixSetOp : 'in' | 'intersect' | 'union' ;

// either id[e1...en] or [a1...an][e1...en]
arrayaccess : ID simpleNonEmptyList | simpleNonEmptyList simpleNonEmptyList;


// case expressions
caseExpr   : 'case' ID 'of' (caseBranch ';')+ 'endcase';
caseBranch : (predOrUnionExpr|ID) '-->' expr;  

// lists
listExpr: listValue 
          | listExpr '++' listExpr
          | oneDimList 
          | multiDimList ;
oneDimList :  simpleList | guardedList  ;
// the , at the end is allowed by MiniZinc
simpleList : '[' ']' | simpleNonEmptyList;
simpleNonEmptyList : '[' nonEmptyListElems(',')? ']';
guardedList : '[' nonEmptyListElems '|'  guard ']' ;
multiDimList : '[|' nonEmptyListElems ((',')? '|' nonEmptyListElems  )* ('|')? '|]' ;
nonEmptyListElems : expr (',' expr)*;

listValue : stringExpr | ID | ifExpr | arrayaccess | predOrUnionExpr | qualified;

inDecl : ID (','ID)* 'in' setExpr whereCond?;
whereCond : 'where' boolExpr;

// let
letExpr : 'let' '{' letDecl   (',' letDecl)* '}' 'in' expr;
letDecl : decl | constraint;

// if
ifExpr : 'if' bodyIf ;
bodyIf : expr 'then' expr (elseS | elseifS) ;
elseS : 'else' expr 'endif';
elseifS : 'elseif' bodyIf;

// sets
setVal : bracketExpr | range | guardedSet ;
setExpr : setVal | setExpr infixSetOp setExpr;
bracketExpr : '{' '}' | '{'  commaList '}';
guardedSet : '{'  expr '|' guard  '}' ;
commaList :  (expr (','expr)*);
guard :  inDecl (',' inDecl)*;


range : fromR '..' toR
      | ID
      ;

fromR : arithExpr;
toR  : arithExpr;
rint   : 'int';
rfloat : 'float';
rbool  : 'bool';
integer : NAT | '-' NAT;
real : integer '.' NAT;

string : STRING;

STRING: '"' ((~('"') | ESC | '.' | '^'| '#'))* '"';
//string : (ESC|.)*?;
ESC:'\\"' | '\\\\' | '\\n' | '\\t';

