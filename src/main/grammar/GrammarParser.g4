grammar GrammarParser;

file: (entryPoint grammar_rule+) EOF;

entryPoint: ENTRY_MARKER NON_TERMINAL SEMICOLON;

grammar_rule:
      parse_rule SEMICOLON
    | lexer_rule SEMICOLON;

parse_rule: NON_TERMINAL input_attributes? (COLON output_attributes)? ARROW rule_elements (PIPE rule_elements)*;

lexer_rule:
      TERMINAL EQUAL terminal_value # tokenRule
    | TERMINAL NOT_EQUAL terminal_value # skipRule
    ;

terminal_value:
      REGEX
    | STRING
;

input_attributes: LBRAKET attribute (COMMA attribute)* RBRAKET;
output_attributes: TERMINAL;

attribute: attribute_name EQUAL attribute_value;

attribute_name: NON_TERMINAL;
attribute_value: TERMINAL;

rule_elements:
    element*
;

element: NON_TERMINAL arguments? | TERMINAL | CODE;

arguments: LPARENTHESIS argument (COMMA argument)* RPARENTHESIS;
argument : NON_TERMINAL | TERMINAL | CODE;

ENTRY_MARKER: '=>';
SEMICOLON: ';';
COLON: ':';
COMMA: ',';
PIPE: '|';
ARROW: '->';
EQUAL: '=';
NOT_EQUAL: '!=';
LPARENTHESIS: '(';
RPARENTHESIS: ')';
LBRAKET: '[';
RBRAKET: ']';

TERMINAL: [A-Z][a-z_A-Z0-9<>]*;
NON_TERMINAL: [a-z][a-z_A-Z0-9]*;

REGEX : '\'' (~('\''|'\r' | '\n') | '\\\'')* '\'';
REGEX_STYLE: '\'' ;
CODE : '{' (~[{}]+ CODE?)* '}' ;
WHITESPACE: [ \t\r\n]+ -> skip;
STRING : '"' (~('"') | '\\"')* '"';
