package declarative

object DeclarativeSum {

  def main(args: Array[String]): Unit = {
    val numbers = List(2, 5, 1, 7, 3, 9, 6, 4)

    val answer1 = sum1(numbers)
    val answer2 = sum2(numbers)
    val answer3 = sum3(numbers)
    val answer4 = sum4(numbers)

    println(answer1)
    println(answer2)
    println(answer3)
    println(answer4)
  }

  def sum1(numbers: List[Int]): Int = {
    if (numbers.isEmpty) 0 else numbers.head + sum1(numbers.tail)
  }

  def sum2(numbers: List[Int]): Int = numbers match {
    case Nil => 0
    case _ => numbers.head + sum2(numbers.tail)
  }

  def sum3(numbers: List[Int]): Int = {
    loop(0, numbers)
  }

  private def loop(sum: Int, nums: List[Int]): Int = nums match {
    case Nil => sum
    case _ => loop(sum + nums.head, nums.tail)
  }

  def sum4(numbers: List[Int]): Int = numbers.reduce((a, b) => a + b)
}
