package lectures.part1basics

object StringOps extends App {

  val aString: String = "Hello, I am learning Scala"

  println(aString.charAt(2))
  println(aString.substring(7, 11))
  println(aString.split(" ").toList)
  println(aString.startsWith("Hello"))
  println(aString.replace(" ", "_"))
  println(aString.toLowerCase())
  println(aString.length)

  val aNumString = "45"
  val aNum = aNumString.toInt

  println('a' +: aNumString :+ 'z')
  println(aString.reverse)
  println(aString.take(2))

  // Scala-specific : string interpolator

  // s-interpolator
  val name = "Abi"
  val age = 28
  val greeting = s"Hello, my name is $name and I am $age years old."
  println(greeting)

  val anotherGreeting = s"Hello, my name is $name and I am ${age + 1} years old."
  println(anotherGreeting)

  // f-interpolator
  val speed = 1.3
  val myth = f"$name can eat $speed%2.2f burgers per minute"
  println(myth)

  // raw-interpolator
  println(raw"This is a \n newline")

  val escaped = "This is a \n newline" // ignored inside raw chars from string
  println(raw"$escaped")
}
