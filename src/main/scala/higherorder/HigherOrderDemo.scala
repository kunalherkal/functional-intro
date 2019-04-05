package higherorder

object HigherOrderDemo {

  def main(args: Array[String]): Unit = {
    val answer = add(10, 20)
    println(answer)

    operation(10,30, (a, b) => a + b)



  }

  def add(a: Int, b: Int): Int = a + b
  def mul(a: Int, b: Int): Int = a * b
  def mul2(a: Int, b: Int): Int = a*a * b*b

  def operation(a: Int, b: Int, op: (Int, Int) => Int): Int = op(a, b)


}
