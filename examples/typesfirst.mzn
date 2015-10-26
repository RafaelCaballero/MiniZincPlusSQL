% Declarations Section
var varchar:w2_word;
var int:w2_syllables;
var int:w2_type;
array [1..3] of  var varchar:w_word;
array [1..3] of  var int:w_syllables;
array [1..3] of  var int:w_type;

% Constraints Section
constraint (w2_syllables <= 4) /\ (w2_syllables >= 1);
constraint (w2_type <= 4) /\ (w2_type >= 1);
constraint forall(index_w_syllables_1 in 1..3)((w_syllables[index_w_syllables_1] <= 4) /\ (w_syllables[index_w_syllables_1] >= 1));
constraint forall(index_w_type_1 in 1..3)((w_type[index_w_type_1] <= 4) /\ (w_type[index_w_type_1] >= 1));


