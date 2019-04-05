
object ExpressionDemo {

  def main(args: Array[String]): Unit = {

    val m = max(10, 8)
    println(m)

    val l = createList(10)
    println(l)
  }

  def max(a: Int, b: Int): Int = if(a > b) a else b

  def createList(n: Int): List[Int] = {
    val seq = for (a <- 1 to n) yield a
    seq.toList
  }
}
