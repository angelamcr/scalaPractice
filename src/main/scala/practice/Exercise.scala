package practice

object Exercise {

  def factorial(n: Int): Int = {
    def loop(acc: Int, n: Int): Int =
      if (n == 0) acc
      else loop(acc * n, n -1)
    loop(1,n)

  }

  def sum(f: Int => Int)(a: Int, b: Int): Int =
      if (a > b) 0
      else f(a) + sum(f)(a + 1, b)


  def identity = (x: Int) => x
  def squares = (x: Int) => x * x
  def cubes= (x: Int) => x * x * x


  def product(f: Int => Int)(a: Int, b: Int): Int = mapReduce(f, (x, y) => x * y, 1)(a, b)

  def fact(n: Int): Int = product((x: Int) => x)(1, n)

  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
    if (a > b) zero
    else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))

}
