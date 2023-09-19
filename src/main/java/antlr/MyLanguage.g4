grammar MyLanguage;

/* the grammar name and file name must match */

@header {
    package antlr;
}

// Start variable
prog: (decl | expr)+ EOF
    ;

decl: ID ':' INT_TYPE '=' NUM
    ;

/* ANTLR resolves ambiguties in favor of the alternative given first */
expr: expr '*' expr
    | expr '+' expr
    | ID
    | NUM
    ;

/* Tokens */
ID: [a-z][a-zA-Z0-9_]*;
NUM: '0' | '-'?[1-9][0-9]*;
INT_TYPE: 'INT';
COMMENT: '--' ~[\r\n]* -> skip;
WS: [ \t\r\n]+ -> skip;