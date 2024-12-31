grammar bp;

prog:  BEGIN stm* END;

stm:   ID  ASSIGN expr SEMI    # AssignStm
    |  READ LBR ID RBR SEMI    # ReadStm
	|  WRITE LBR ID RBR SEMI   # WriteStm
	;

expr:  LBR expr RBR            # parens
     | NEG expr                # NegOp
	 | expr op=(AND | OR ) expr # BinOp
	 | BV                      # boolV
	 | ID                      # id
	 ;

ASSIGN:  ':=' ;
WRITE:  'write' ;
READ:  'read' ;
BEGIN:  'begin' ;
END:  'end' ;

LBR:  '(' ;
RBR:  ')' ;
SEMI: ';' ;
AND: '&' ;
OR:  '|' ;
NEG: '~' ;

fragment Letter: [a-zA-Z];
fragment Digit:  [0-9];
fragment Underscore: '_';

ID:  Letter(Letter | Digit | Underscore)* ;

BV:  'true' | 'false' ;

WS:  [ \t\n\r]+ -> skip;
