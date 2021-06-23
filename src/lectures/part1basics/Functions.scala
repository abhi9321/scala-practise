package lectures.part1basics

object Functions  extends App {

  def aFunction(a: String, b: Int): String =
    a + " " + b

  def aFunction1(a: String, b: Int): String = {
    a + " " + b
  }



  println(aFunction("hello", 1))
  println(aFunction("hello", 2))

  def aParameterlessFunction(): Int = 42

  println(aParameterlessFunction())
  println(aParameterlessFunction)

  // compiler figures out the return type but it will not for recursive function
  def aRepeaterFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeaterFunction(aString, n-1)
  }
  println(aRepeaterFunction("hello", 3))
  // when you need loops, use recursion

  // compiler figures out the return type even if we don't specify the return type
  def aFunction2(a: String, b: Int)  = {
    a + " " + b
  }

  def aFuncWithSideEffects(aString: String): Unit = println(aString)


  def aBigFunction(n: Int): Int = {
    def aSmallerFunc(a: Int, b:Int): Int = a + b

    aSmallerFunc(n, n-1)
  }
}
