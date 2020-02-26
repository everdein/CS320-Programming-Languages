grammar json2;

file
: object
;

object
: '{' pair (',' pair)* '}'
;

pair
: STRING ':' value
;

value
: array
| STRING
| NUMBER
| object
;

array
: '[' value (',' value)* ']'
;

STRING
: '"' (~["\\])* '"'
;

NUMBER
: [0-9]+
;


// Complete white space
WS
: [\t\r\n]+ -> skip ;		// skip spaces, tabs, newlines
