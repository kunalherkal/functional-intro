object composition extends App {

  def sub3: Int => Int = a => a - 3

  def doubleIt: Int => Int = a => a * 2

  def add5: Int => Int = a => a + 5

  def convertToString: Int => String = a => s"Now this is a string: $a"

  val custom: Int => String =  sub3.andThen(doubleIt).andThen(add5).andThen(convertToString)

  val answer = custom(2)
  println(answer)

}
