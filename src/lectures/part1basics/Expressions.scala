package lectures.part1basics

object Expressions extends App{

  val x = 1 + 2
  println(x)

  println(1 + 3 * 4) // + - * / & !^ << >> >>>(right shift with zero extension)

  println(1 == x)

  // Instructions (do this, send this) vs Expressions (something that has value)

  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF expressions or IF instruction
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)

}
