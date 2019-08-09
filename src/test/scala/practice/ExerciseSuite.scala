package practice

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatestplus.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class ExerciseSuite extends FunSuite {

  import Exercise._


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


  test( "Factorial of 4 equals 24"){
    assert(factorial(4) === 24)
  }


  test( "Factorial of 0 equals 1"){
    assert(factorial(0) === 1)
  }


  test( "Factorial of 1 equals 1"){
    assert(factorial(1) === 1)
  }

  test( "Sum of cubes from 1 to 3 equals 36"){
    assert(sum(cubes)(1, 3) === 36)
  }

  test( "Sum of squares from 3 to 5 equals 50"){
    assert(sum(squares)(3, 5) === 50)
  }

  test( "Sum of ints from 3 to 5 equals 12"){
    assert(sum(identity)(3, 5) === 12)
  }

  test( "Product of ints from 0 to 5 equals 0"){
    assert(product(identity)(0, 5) === 0)
  }

  test( "Product of ints from 1 to 5 equals 120"){
    assert(product(identity)(1, 5) === 120)
  }

  test( "Product of squares from 3 to 4 equals 144"){
    assert(product(squares)(3, 4) === 144)
  }

  test( "Fact of 4 equals 24"){
    assert(fact(4) === 24)
  }


  test( "Fact of 0 equals 1"){
    assert(fact(0) === 1)
  }


  test( "Factof 1 equals 1"){
    assert(fact(1) === 1)
  }

}
