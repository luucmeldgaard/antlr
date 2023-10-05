grammar Delivery;

/* the grammar name and file name must match */

@header {
    package delivery;
}

// Start variable

start: (function)+ EOF;



function: '.hardware' IDENTIFIER
        | '.inputs' IDENTIFIER+
        | '.outputs' IDENTIFIER+
        | '.update' exp_list
        | '.simulate' exp_list
        | '.latches' exp_list
        ;

exp_list: exp+;

exp:    term (assign (term|BINARY) | operator) term

        ;

term: '(' exp ')'
    | ('!')? IDENTIFIER  // atomic expression
    ;

operator:   '||'
        |   '&&' ;

assign: '->' | '=' ;

/* Tokens */
IDENTIFIER: [a-zA-Z][a-zA-Z0-9_]*;
BINARY: ('0'|'1')+ ;
COMMENT: '//' ~[\r\n]* -> skip;
WHITESPACE: [ \t\r\n]+ -> skip;
LONGCOMMENT: '/*' .*? '*/' -> skip;