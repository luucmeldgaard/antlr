grammar hdl0;

start: (hw=hardware in=inputs out=outputs lat=latches up=update sim=simulate) EOF;

hardware: '.hardware' id=IDENTIFIER;
inputs: '.inputs' id=IDENTIFIER*;
outputs: '.outputs' id=IDENTIFIER*;
latches: '.latches' stmt=latchExpr*;
update: '.update' stmt=updateExpr*;
simulate: '.simulate' stmt=simulateExpr*;

expr: e=IDENTIFIER			# Exp
    | '!' e=IDENTIFIER		# Neg
    | '(' e=expr ')'		# Paren
    | e1=expr '&&' e2=expr	# And
    | e1=expr '||' e2=expr	# Or
    ;

latchExpr: in=expr '->' out=expr;
updateExpr: out=expr '=' exp=expr;
simulateExpr: in=expr '=' values=BINARY;

IDENTIFIER: [a-zA-Z][a-zA-Z0-9_]*;
BINARY: [0-1]+;
COMMENT: '//' ~[\r\n]* -> skip;
WHITESPACE: [ \t\r\n]+ -> skip;
LONGCOMMENT: '/*' .*? '*/' -> skip;