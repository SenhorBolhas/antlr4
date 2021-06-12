lexer grammar CommonLexerRules;

IF: 'if';
ELSE: 'else';
WHILE: 'while';
FOR: 'for';
PRINT: 'println';
PRINTSTR: 'printlnstr';
OPREL: ('<'|'>'|'=='|'<>');
MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
EQ: '=';
ABCHAV: '{';
FECHAV: '}';
APARE: '(';
FPARE: ')';
VIG: ',';
PTVIG: ';';
TYPES: ('int'|'float'|'string');
CONST: 'const';
ID: [a-zA-Z]+;
INT: [0-9]+;
FLOAT
 : [0-9]+ '.' [0-9]*
 | '.' [0-9]+
 ;
STRING
 : '"' (~["\r\n] | '""')* '"'
 ;
COMMENT: '/*' .*? '*/' -> skip;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;