import scala.io.Source

object Zad8 extends App {


  val source = Source.fromURL("http://photobucket.com/images/lorem/?page=4#!")
  val splitSource = source.mkString.split('\n')
  val Pattern = ".*<img.*src=\"(.*)\".*/>.*".r
  splitSource.map{
    case Pattern(url) => url
    case i => ""
  }.foreach(println)


}
