// Define a grammar called test
grammar json1;
file   : object;
object : '{'pair (',' pair)*'}';	// 
pair   : STRING ':' value;		// 
value  : STRING|NUMBER;			// 
STRING : '"'[a-zA-Z]+'"';		// 
NUMBER : [0-9]+;			// 
WS     : [\t\r\n]+ -> skip ;     	// skip spaces, tabs, newlines
