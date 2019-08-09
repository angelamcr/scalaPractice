package practice

class Rational(x: Int, y: Int) {
  require(y > 0, "y must be positive")

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  val g =  gcd(x, y)

  def numer = x / g
  def denom = y / g

  def this(x: Int) = this(x, 1)

  def add(that: Rational): Rational =
    new Rational(numer * that.denom + that.numer * denom, denom * that.denom)

  def sub(that: Rational): Rational =
    add(that.neg)

  def neg: Rational = new Rational(-numer, denom)

  def less(that: Rational) = numer * that.denom < that.numer * denom

  def max(that: Rational): Rational = if(this.less(that)) that else this

  override def toString =
    numer + "/" + denom
}
