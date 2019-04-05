package declarative

case class Avenger(name: String, power: Int, intelligence: Int)


object AvengersDemo {

  def main(args: Array[String]): Unit = {

    val avengers = List(Avenger("Iron Man", 80, 100),
      Avenger("Captain America", 70, 90),
      Avenger("Hulk", 100, 0),
      Avenger("Black Widow", 0, 80),
      Avenger("Hawkeye", 0, 80))

    val avengerNames: List[String] = avengers.map(a => a.name)
    println(avengerNames)
    println("-----------")


    val realAvengersNames = avengers.filter(a => a.power > 50).map(a => a.name)
    println(realAvengersNames)
    println("-----------")


    val intelligentAvengers = avengers.filter(a => a.intelligence > 50).map(a => a.name)
    println(intelligentAvengers)
    println("-----------")

    val avengerNames2 = avengers.map(a => a.name)
    println(avengerNames2)
    println("-----------")
  }
}
