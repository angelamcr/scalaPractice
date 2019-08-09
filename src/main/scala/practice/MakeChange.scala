package practice

object MakeChange {

  /**
    * This method computes the number of different ways that we can make
    * change certain amount of dollars given that the coins available are
    * half dollars, quarters, dimes, nickels and pennies.
    *
    * @param dollars The amount of money to make change
    * @return The number of different ways that the dollars can be make chance
    */
  def makeChange(dollars: Int): Int =
    countChange(dollars * 100, List(50, 25, 10, 5, 1))


  def countChange(amount: Int, coins: List[Int]): Int =
    if (amount == 0)  1
    else if (amount < 0 || coins.isEmpty) 0
    else countChange(amount, coins.tail) + countChange(amount-coins.head, coins)
}
