package exercises

import scala.annotation.tailrec

object TailRecursionExercise extends  App {

//  concatenate a string n times
  @tailrec
  def concatenateTailrec(aString: String, n: Int, accumulator: String): String = {

    if (n <= 0) {
      accumulator
    }
    else {
      concatenateTailrec(aString, n-1, aString + accumulator)
    }
  }
  println(concatenateTailrec("hello", 3, ""))


  //IsPrime function tail recursive

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailrec(t-1, n% t != 0 && isStillPrime)
    }
    isPrimeTailrec(n/2, true)

  }
  println(isPrime(2003))
  println(isPrime(629))

  def fibonacci(n: Int): Int = {
    def fibTailrec(i: Int, last: Int, nextToLast: Int): Int =
      if (i >= n) last
      else fibTailrec( i+1, last + nextToLast, last)

    if (n<=2) 1
    else fibTailrec(2, 1, 1)
  }

  println(fibonacci(8))
}
