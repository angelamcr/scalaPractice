package practice

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatestplus.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class FixedPointSuite extends FunSuite {

  import FixedPoint._


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



  test( "Fixed point with first guess 1 equals 1.999"){
    assert(fixedPoint(x => 1 + x/2)(1) === 1.999755859375)
  }

  test( "Square root of 2 equals 1.4142156862745097"){
    assert(sqrt(2) === 1.4142156862745097)
  }

}
