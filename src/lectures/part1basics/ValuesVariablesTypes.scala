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


}
