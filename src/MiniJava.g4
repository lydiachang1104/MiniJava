grammar MiniJava;

goal:   mainClass classDeclaration* EOF
    ;

mainClass
    :   'class' ID '{' 'public' 'static' 'void' 'main' '(' 'String' '['']' ID ')' '{' statement '}' '}' ;

classDeclaration
    :   'class' ID '{' varDeclaration* methodDeclaration* '}'
    |	'class' ID 'extends' ID '{' varDeclaration* methodDeclaration* '}'
    ;

varDeclaration
    :   type ID ';'
    ;


methodDeclaration:	'public' type ID '(' formalList? ')' '{' varDeclaration* statement*  'return' expression ';' '}' ;

formalList:	type ID formalMore* ;

formalMore:	',' type ID ;

type:	'int' '[' ']'
    |	'boolean'
    |	'int'
    |	ID
    ;

statement
    :   '{' statement* '}'
    |   'if' '(' expression ')'
            statement
        'else'
            statement
    |   'while' '(' expression ')'
            statement
    |   'System.out.println' '(' expression ')' ';'
    |   ID '=' expression ';'
    |   ID '[' expression ']' '=' expression ';'
    |   'return' expression ';'
    |   'recur' expression '?' methodArgumentList ':' expression ';'
    ;

expression
    :   expression '[' expression ']'
    |   expression '.' 'length'
    |   expression '.' ID methodArgumentList
    |   '-' expression
    |   '!' expression
    |   'new' 'int' '[' expression ']'
    |   'new' ID '(' ')'
    |   expression '*'  expression
    |   expression '/'  expression
    |   expression '+'  expression
    |   expression '-'  expression
    |   expression '<'  expression
    |   expression '&&' expression
    |   INT
    |   BOOL
    |   ID
    |   'this'
    |   '(' expression ')'
    ;

methodArgumentList
    :   '(' (expression (',' expression)*)? ')'
    ;

INT
    :   ('0' | [1-9][0-9]*)
    ;

BOOL
    :   'true'
    |   'false'
    ;

ID
    :   [a-zA-Z_][0-9a-zA-Z_]*
    ;

WS
    :   [ \r\t\n]+ -> skip
    ;

COMMENT
    : '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    : '//' ~[\r\n]* -> skip
    ;
