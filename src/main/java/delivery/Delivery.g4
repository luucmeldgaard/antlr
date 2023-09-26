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

assign: (IDENTIFIER|exp) ('->' | '=') (IDENTIFIER|exp) ;

exp:    term (('||') (term|BINARY))*
   |    term (('&&') (term|BINARY))* ;
term: '(' exp ')'
    | ('!')? IDENTIFIER  // atomic expression
    ;

operator:   '||'
        |   '&&' ;

/* Tokens */
IDENTIFIER: [a-zA-Z][a-zA-Z0-9_]*;
BINARY: ('0'|'1')+ ;
COMMENT: '//' ~[\r\n]* -> skip;
WHITESPACE: [ \t\r\n]+ -> skip;
LONGCOMMENT: '/*' .*? '*/' -> skip;