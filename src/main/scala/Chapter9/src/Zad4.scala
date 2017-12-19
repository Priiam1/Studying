import scala.io.Source

object Zad4 extends App {

  val source = Source.fromFile("C:\\Users\\Jakub\\IdeaProjects\\Chapter9\\resorses\\RandomFoatNumbersFile.txt")
  val tokens = source.mkString.split("\\s+")
  val numbers = for(w <- tokens) yield w.toDouble
  val sum = numbers.sum
  val average = numbers.sum / numbers.length
  val max = numbers.max
  val min = numbers.min
  println(sum + " " + average + " " + max + " " + min)
}
