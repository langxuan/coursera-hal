package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  def and(x: Boolean, y: Boolean) = if (x) y else false

  def or(x: Boolean, y: Boolean) = if (x) true else y

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
  	if (or(c == 0, c == r)) 1
	else pascal(c - 1, r - 1) + pascal(c, r - 1)
  } 

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
	
	def canMatch(i: Int, cs: List[Char]): Boolean = {
	  if (i == 0) balance(cs)
	  else if (cs.isEmpty) false
	  else if (cs.head == '(') canMatch(i + 1, cs.tail)
	  else if (cs.head == ')') canMatch(i - 1, cs.tail)
	  else canMatch(i, cs.tail)
	}

  	if (chars.isEmpty) true
	else if (chars.head == ')') false
	else if (chars.head != '(') balance(chars.tail)
	else canMatch(1, chars.tail)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
	
  	if (money == 0) 1
	else if (money < 0) 0
	else if (coins.isEmpty) 0
	else countChange(money - coins.head, coins) + countChange(money, coins.tail)
  }
}
