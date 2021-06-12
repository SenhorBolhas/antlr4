grammar LabeledExpr;

import CommonLexerRules;

prog: stat+;

stat: whileloop NEWLINE # whileLoopC
    | forloop NEWLINE # forLoopC
    | conditional NEWLINE # condi
    | expr NEWLINE # exp
    | declaration NEWLINE # declar
    | declarationSimple NEWLINE # declarSimple
    | declarationConst NEWLINE # declarConst
    | (asignNumberExpr|asignStringExpr) NEWLINE # assing
    | PRINT APARE (expr | stringexpr) FPARE # Println
    | PRINTSTR APARE (concatStringexpr | stringexpr) FPARE # Printlnstr
    | NEWLINE # blank
    ;

// DECLARATION
declaration:
    TYPES ID (VIG TYPES ID)*PTVIG # declarationExpr
    ;

// DECLARATION SIMPLE
declarationSimple:
    TYPES ID (VIG ID)*PTVIG # declarationSimpleExpr
    ;

// CONST DCL
declarationConst:
    CONST TYPES ID EQ (expr | stringexpr) # declarationConstExpr
    ;

// CONDITIONAL
conditional:
    IF APARE comparisson FPARE ABCHAV expr stat+ FECHAV (ELSE ABCHAV expr stat+ FECHAV)? # conditionalExpr
    ;

//WHILE
whileloop:
    WHILE APARE comparisson FPARE ABCHAV expr stat+ FECHAV # whileLoopExpr
    ;

//FOR LOOP
forloop:
    FOR APARE asignNumberExpr PTVIG comparisson FPARE ABCHAV stat+ FECHAV # forLoopExpr
    ;

//ASSIGN
asignNumberExpr:
    ID EQ expr # assingNumber
    ;

asignStringExpr:
    ID EQ stringexpr # assingString
    ;

// EXPRESSIONS
expr:
    expr op=(MUL | DIV) expr # MulDiv
    | expr op=(ADD | SUB) expr # AddSub
    | INT # int
    | ID # id
    | FLOAT # float
    | APARE expr FPARE # parens
    ;

stringexpr:
    STRING # string
    ;

concatStringexpr:
    op1=(ID | STRING) sumStringExpr+ # concatString
    ;

sumStringExpr:
    ADD op2=(ID | STRING) # sumString
    ;

//COMPARISSON
comparisson:
    op1=(INT | FLOAT | ID) OPREL op2=(INT | FLOAT | ID) # comparissonExpr
    ;