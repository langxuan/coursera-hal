# Functional Programming Principles in Scala >> Functions & Evaluations
***
## Programming Paradigms
* Main programming paradigms
	+ imperative
		- variables, assignments, control structures
	+ functional
	+ logic
* the problem of imperative programming is scaling up, how not to conceptualize data structures word-by-word
* A theory consists of
	+ data types
	+ operations on types
	+ relationships between values and operations
	+ no description of mutations
* focusing on the functions
* functions in FP language:
	+ can be defined anywhere, even in other functions
	+ can be parameters and results as other value
	+ exists operators to compose functions
* why functional programming
	+ simpler reasoning principles
	+ better modularity
	+ better parallelism

***
## Elements of Programming
* REPL, Read-Eval-Print Loop
* call-by-value and call-by-name both reduces to the same final values as long as
	+ reduced expression consists of pure functions
	+ evaluations terminate
* CBV will evaluate each argument only once while CBN is like lazy evaluation and will not evaluate the arguments which are not used at all

***
## Evaluation Strategies and Termination
* if CBV terminates, then CBN terminates too
* scala normally uses CBV, but if the type of a function parameter starts with =>, it uses CBN, like def f(x: => Int) = 1

***
## Conditionals and Value Definitions
* false && e, true || e are short-circuit evaluation, do not need the right operand to be evaluated
* *def* is for by-name, *val* is for by-value
* when define a function, one should always mark the types of arguments

***
## Example: square roots with Newton's method
* Recursive functions need an explicit return type in Scala, for non-recursive functions, the return type is optional

***
## Blocks and Lexical Scope
* the last element of a block is an expression that defines its value
* multiple expressions on a line should be separated by semicolons
