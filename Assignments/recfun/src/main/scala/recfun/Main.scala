package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 20) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
     
   println(balance(List('(',')')))
   println(countChange(4,List(1,2)))
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
     if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
    
  }
  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = { 
    def f(chars: List[Char], num: Int): Boolean = {
      (chars,num) match {
        case (Nil,num) => return num == 0
        case (c :: tail,num) =>
          if(num < 0) return false
          if(c == '(') return f(tail,num+1)
          if(c == ')') return f(tail,num-1)
          else return f(tail,num)
      }
    }
    f(chars,0)
  }
  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int =  {
      if (coins.isEmpty) if (money == 0) 1 else 0
      else if (money - coins.head == 0) 1
      else if (money - coins.head < 0) 0
      else countChange(money - coins.head, coins) + countChange(money, coins.tail)
}
}
