package lectures.part1basics

import scala.annotation.tailrec
import scala.jdk.Accumulator

object Recursion extends App {

  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n +" - I first need factorial of " + (n-1))
      val result = n * factorial(n-1)
      println("Computed factorial of " + n)

      result
    }
  }
  println(factorial(10))
//  println(factorial(100200)) // stackOverFlowError


  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x-1, x * accumulator) // Tail recursion = use recursive call as the LAST expression

    factHelper(n,1)

  }

  /*
    anotherFactorial(10) = factHelper(10,1)
    = factHelper(9, 10 * 1)
    = factHelper(8, 9 * 10 * 1)
    = factHelper(7, 8 * 9 * 10 * 1)
    = ...
    = ...
    factHelper(2, 3 * 4 * 5 * 6 * ... * 10 * 1 )
    factHelper(1, 2 * 3 * 4 * 5 * 6 * ... * 10 * 1 )
    factHelper( 2 * 3 * 4 * 5 * 6 * ... * 10 * 1 )
   */

  println(anotherFactorial(5000))

  // when you need loops, use tail_recursion

}
