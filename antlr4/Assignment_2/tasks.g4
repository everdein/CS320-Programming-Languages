grammar tasks;

start 
	: task task task task task
	;

task 
	: function 
	;

//function
//	: operator '<-' 'function' '(' parameter ')' '{' action '}' 
//	| operator '<-' 'function' '(' parameter ')' '{' action action '}'
//	;

//operator
//	: 'add'
//	| 'subtract'
//	| 'multiply'
//	| 'divide'
//	| 'countdown'
//	;

function
	: STRING '<-' 'function' '(' parameter ')' '{' action '}' 
	| STRING '<-' 'function' '(' parameter ')' '{' action action '}'
	;

STRING
	: 'add'
	| 'subtract'
	| 'multiply'
	| 'divide'
	| 'countdown'
	;

parameter
	: value ',' value
	| value
	;

value
	: 'x'
	| 'y'
	| 'from'
	| '0'
	| '1'
	;

action
	: result
	| operate
	| call
	| loop
	| assignment
	;

result
	: 'return(' action ')'
	;

operate
	: value math value
	| 'from' math value
	;

math
	: '+'
	| '-'
	| '*'
	| '/'
	| '!='
	;

call
	: 'print' '(' parameter ')'
	|'Sys' '.' 'sleep' '(' parameter ')'
	;

loop
	: 'while' '(' compare ')' '{' action action action '}'
	;

compare
	: value math value
	;

assignment
	: 'from' '<-' operate
	;

WS : [\t\r\n] -> skip ;

// add subtrace multiply divide countdown
