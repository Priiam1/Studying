import scala.io.Source


object Zad6 extends App {
  val source = Source.fromFile("resorses\\RandomTextFile.txt")
  val token = source.mkString.split("\\s+")
  val x = "dasca"
  //val tokens = source.mkString.split("\\s+")
  //val allNumbers = tokens.map(_.toInt)
  val re = "[0-9]+".r
  //val noNumbers = tokens.filter(_.isInstanceOf[String]).foreach(print)
  token.filter(s => re.findAllIn(s).isEmpty).toList.foreach(println)
  //val s = Source.fromURI()
}
