table  words = "speech.words";
int: nwords  = 6;
int: nlines  = 3;
array[1..nwords] of var words:w; 

int: noun      = 1; 
int: adjective = 2;
int: adverb    = 3; 

% types of words
constraint (w[1].type=adjective \/ w[1].type=adverb); 
constraint (w[1].type=adjective /\ w[2].type=noun)       \/ 
           (w[1].type=adverb    /\ w[2].type=adjective);

constraint w[3].type=w[1].type  /\  w[4].type=w[2].type;

constraint (w[1].type=adjective /\ w[5].type=adverb)     \/ 
           (w[1].type=adverb    /\ w[5].type=adjective);

constraint (w[5].type=adjective /\ w[6].type=noun)       \/ 
           (w[5].type=adverb    /\ w[6].type=adjective); 

% metre
constraint forall(i in 1..nlines)(w[2*i-1].syllables + 
                                    w[2*i].syllables = 6);

% different words
constraint w[2*1-1].word != w[2*2-1].word /\ w[2*1-1].word != w[2*3-1].word
           /\  w[2*2-1].word != w[2*3-1].word; 
constraint w[2*1].word != w[2*2].word /\ w[2*1].word != w[2*3].word  
           /\  w[2*2].word != w[2*3].word; 

% rhyme: adjectives must end in 'ous', adverbs in 'i_e'
constraint forall(i in 1..nlines)( 
            (w[2*i].type=adjective /\ w[2*i].word like "%ous")
             \/
            (w[2*i].type=noun      /\ w[2*i].word like "%i_e")); 

solve satisfy;

