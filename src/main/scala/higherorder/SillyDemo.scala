package higherorder

object SillyDemo {

  def main(args: Array[String]): Unit = {
    val answer = add1(10)
    println(answer)
  }

  def add1(a: Int): Int = a + 1

}
