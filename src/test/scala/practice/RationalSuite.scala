package practice

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatestplus.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class RationalSuite extends FunSuite {

  /**
    * We only provide two very basic tests for you. Write more tests to make
    * sure your `sum` and `max` methods work as expected.
    *
    * In particular, write tests for corner cases: negative numbers, zeros,
    * empty lists, lists with repeated elements, etc.
    *
    * It is allowed to have multiple `assert` statements inside one test,
    * however it is recommended to write an individual `test` statement forNewtonsMethodSuite
    * every tested aspect of a method.
    */



  test( "adding 1/2 and 5/7 returns 22/21") {
    val x = new Rational(1, 3)
    val y = new Rational(5, 7)
    assert(x.add(y).toString === "22/21")
  }

  test( "subs three numbers returns -79/42") {
    val x = new Rational(1, 3)
    val y = new Rational(5, 7)
    val z = new Rational(3, 2)
    assert(x.sub(y).sub(z).toString === "-79/42")
  }

  test( "adding 5/7 and 5/7 returns 10/7") {
    val y = new Rational(5, 7)
    assert(y.add(y).toString === "10/7")
  }

  test( "1/2 less than 5/7 returns true") {
    val x = new Rational(1, 3)
    val y = new Rational(5, 7)
    assert(x.less(y) === true)
  }

  test( "max of 1/2 and 5/7 returns 22/21") {
    val x = new Rational(1, 3)
    val y = new Rational(5, 7)
    assert(x.max(y).toString === "5/7")
  }

  test( "rational with only the num 2 is 2/1") {
    val x = new Rational(2)
    assert(x.toString === "2/1")
  }

  test("require throws an exception if its denominator is 0") {
    intercept[IllegalArgumentException] {
      new Rational(1, 0)
    }
  }

}
