package exercises

object FunctionsExercise extends App {

  //  greeting function
  def greetingFunction(name: String, age: Int): String = {
    "Hi, my name is " + name + " and i am " +  age + " years old."
  }

  println(greetingFunction("Abhi", 28))


  // factorial function 1 * 2 * 3 * .... n

  def factorial(n: Int): Int =
    if (n <= 0 ) 1
    else n * factorial(n-1)

  println(factorial(5))


   /* A Fibonacci function
     f(1) = 1
     f(2) = 1
     f(n) = f(n-1) + f(n-2)
  */

  def fibonacci(n: Int): Int = {
    if (n<=2) 1
    else fibonacci(n - 1) + fibonacci(n-2)
  }

  println(fibonacci(8))

  // Tests if a number is prime

  def isPrime(n: Int): Boolean = {

    def isPrimeUntil(t: Int): Boolean =
      if (t<=1) true
      else n % t !=0 && isPrimeUntil(t-1)

    isPrimeUntil(n/2)
  }
  println(isPrime(2))
  println(isPrime(37))
  println(isPrime(37817))
}
