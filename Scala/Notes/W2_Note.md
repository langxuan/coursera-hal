# Functional Programming Principles in Scala >> Week 2 High Order Functions
***
## Tail Recursion
* tail recursion: a function calls itself as its last action, so the function's stack frame can be reused, so tail recursion functions are iterative processes
* tail-calls: if the last action of a function consists of calling a function(maybe itself), one stack frame would be sufficient for both functions
* @tailrec annotation

***
## Higher-Order Functions
* higher order functions: functions that take other functions as parameters or that return functions as results
* def sum(f: Int => Int, a: Int, b: Int): Int = ???, A => B is the function type
* anonymous functions: (x: Int, y: Int) => x + y (syntactic sugar)

***
## Currying
* def f(args1)...(argsn) = E equivalent to def f(args1)...(argsn-1) = (argsn => E), the style of definition and function application is called currying
* the function types associate to the right
* define a function before using it

***
## Example: Finding Fixed Points
* fixed point algorithm

***
## Scala Syntax Summary
* 