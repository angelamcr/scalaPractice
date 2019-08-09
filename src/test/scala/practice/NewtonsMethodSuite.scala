package practice

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class NewtonsMethodSuite extends FunSuite {

  import NewtonsMethod._


  /**
    * We only provide two very basic tests for you. Write more tests to make
    * sure your `sum` and `max` methods work as expected.
    *
    * In particular, write tests for corner cases: negative numbers, zeros,
    * empty lists, lists with repeated elements, etc.
    *
    * It is allowed to have multiple `assert` statements inside one test,
    * however it is recommended to write an individual `test` statement for
    * every tested aspect of a method.
    */


  test( "Square root of 1"){
    assert(sqr(1.0) === scala.math.sqrt(1))
  }


  test( "Square root of 2"){
    assert(sqr(2.0) === scala.math.sqrt(2))
  }


  test( "Square root of 4"){
    assert(sqr(4.0) === scala.math.sqrt(4))
  }

  test( "Square root of 9"){
    assert(sqr(9.0) === scala.math.sqrt(9))
  }

  test( "Square root of 1000"){
    assert(sqr(1000.0) === scala.math.sqrt(1000))
  }

  test( "Square root of 0.001"){
    assert(sqr(0.001) === scala.math.sqrt(0.001))
  }

  test( "Square root of 1e-6"){
    assert(sqr(1e-6) === scala.math.sqrt(1e-6))
  }

  test( "Square root of 0.1e-20"){
    assert(sqr(0.1e-20) === scala.math.sqrt(0.1e-20))
  }

  test( "Square root of 1.0e20"){
    assert(sqr(1.0e20) === scala.math.sqrt(1.0e20))
  }

  test( "Square root of 1.0e60"){
    assert(sqr(1.0e60) === scala.math.sqrt(1.0e60))
  }


}
