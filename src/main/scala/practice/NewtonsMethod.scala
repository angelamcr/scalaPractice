package practice

object NewtonsMethod {

  /**
    * This method computes the number of different ways that we can make
    * change certain amount of dollars given that the coins available are
    * half dollars, quarters, dimes, nickels and pennies.
    *
    * @param dollars The amount of money to make change
    * @return The number of different ways that the dollars can be make chance
    */
  def sqr(x: Double): Double = {

    def sqrIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrIter(improveGuess(guess))

    def isGoodEnough(guess: Double): Boolean =
      abs(guess * guess - x) / x <= 1e-15

    def improveGuess(guess: Double): Double =
      (guess + x / guess) / 2

    def abs(x: Double): Double =
      if (x < 0) -x else x

    sqrIter(1.0)

  }

}
