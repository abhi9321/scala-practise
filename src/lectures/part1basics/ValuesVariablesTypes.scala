package lectures.part1basics

object ValuesVariablesTypes extends App {

  val x: Int = 42
  println(x)

  //  x = 2 val is immutable

  val y = 42
  println(y) //  COMPILER can infer types

  val aString: String = "Hello"

  val str1 = "string one" ; val one_more_str = "another string"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 432
  val aLong: Long = 1298328921873012003L
  val asFloat: Float = 2.0f
  val aDouble: Double = 323.5023

  // variables
  var aVariable: Int = 4
  aVariable = 567 // can be reassigned. Is know as side effects

  var i = 0
  while (i < 10){
    println(i)
    i += 1
  }

  // avoid while loops
  // EVERYTHING IN SCALA IS AN EXPRESSIONS

  val aWeirdValue = {aVariable = 3} // Unit == void
  println(aWeirdValue)


  // side effects: println(), whiles, reassigning

  // code blocks
  // value of a block is the value of last expression in the block
  // can have there own var, val inside the block
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    var ifRes = if (z>2) "hello" else "goodbye"
    println(ifRes)
  }

  //  val anotherValue = z +1 cannot use z outside the code blocks
}
