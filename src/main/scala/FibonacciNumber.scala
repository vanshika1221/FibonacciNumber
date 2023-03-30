package com.knoldus
import scala.annotation.tailrec

class FibonacciNumber {
  def Fibonacci(number: Int): Option[Int] = {
    @tailrec
    // Tail Recursive function for finding fibonacci number
    def TailRecursiveFibonacci(numberOfTimes: Int, lastNumber: Int, firstNumber: Int, counter: Int): Int = {
      if (numberOfTimes == 0) firstNumber
      else if (counter == numberOfTimes) lastNumber
      else TailRecursiveFibonacci(numberOfTimes, firstNumber + lastNumber , lastNumber, counter + 1)
    }
    // To check whether number is negative or not
    if (number < 0) {
      println("Invalid input.Fibonacci cannot be of negative numbers")
      None
    }
    else {
      val result = TailRecursiveFibonacci(number, 1, 0, 1)
      println(s"The $number-th Fibonacci number is $result")
      Some(result)
    }
  }
}
