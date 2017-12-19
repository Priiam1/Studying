import scala.io.Source

object Zad2 extends App {
  val source = Source.fromFile("C:\\Users\\Jakub\\IdeaProjects\\Chapter9\\resorses\\RandomTextFile.txt").mkString.split("\\s+").filter(_.length > 13).foreach(println)

}
