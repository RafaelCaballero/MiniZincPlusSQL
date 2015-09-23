lexer grammar MiniZincLexer;

SINGLE_LINE_COMMENT : '%' ~[\r\n]* -> skip ;
ID :  [a-zA-Z][a-zA-Z0-9'_']* ;
NAT : [0-9]+ ; 
WS : [ \t\r\n]+ -> skip;
BOOL : 'true' | 'false';