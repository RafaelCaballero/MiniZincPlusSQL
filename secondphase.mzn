% MiniZinc Model parsed using Antlr4
% Rafael Caballero 2015/12/28 18:43:502015



% Declarations Section
var int:y_length;
var int:x_length;
var bool:b0;

% Constraints Section
constraint (((x_length + y_length) > 13) /\ ((x_length + y_length) < 23)) /\ ((b0));
constraint (y_length <= 574) /\ (y_length >= 1);
constraint (x_length <= 574) /\ (x_length >= 1);

% Solve Section
solve  satisfy;

% Output Section
output(["y_length: ",show(y_length),"\n","x_length: ",show(x_length),"\n","b0: ",show(b0),"\n"]);

