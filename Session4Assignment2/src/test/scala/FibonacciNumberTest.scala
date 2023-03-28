package com.knoldus
import org.scalatest.funsuite.AnyFunSuite

class FibonacciNumberTest extends AnyFunSuite {
  val fibonacciObject = new FibonacciNumber

  test("To print nth fibonacci number") {
    val inputNumber = 10
    val result = Some(55)
    assert(fibonacciObject.Fibonacci(inputNumber) === result)
  }

  test("To print 1st fibonacci number") {
    val inputNumber = 1
    val result = Some(1)
    assert(fibonacciObject.Fibonacci(inputNumber) === result)
  }

  test("To print 0th fibonacci number") {
    val inputNumber = 0
    val result = Some(0)
    assert(fibonacciObject.Fibonacci(inputNumber) === result)
  }
}
