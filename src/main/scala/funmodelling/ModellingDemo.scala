package funmodelling

trait Animal
case class Dog() extends Animal
case class Cat() extends Animal


object Animal {

  def speak(animal: Animal) = animal match {
    case Dog() => println(s"DOG SAYS BARK!")
    case Cat() => println(s"CAT SAYS MEOW!")
  }
}


object ModellingDemo {

  def main(args: Array[String]): Unit = {
    val dog: Animal = Dog()
    Animal.speak(dog)

    val cat: Animal = Cat()
    Animal.speak(cat)
  }
}
