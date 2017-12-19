import scala.io.Source


object Zad1 extends App {
  val source = Source.fromFile("C:\\Users\\Jakub\\IdeaProjects\\Chapter9\\resorses\\RandomTextFile.txt")
  val lineIterator = source.getLines
  var lines =  source.getLines.toArray.filter(_.nonEmpty)
  for(i <- lines) println(i)
  var line = ""
  println(lines.size)
  println()

//  for(i <- 0 to lines.size - 1 by 1){
//
//    line = lines(i)
//    lines.update(i, lines(lines.size - i -1))
//    lines.update((lines.size - i - 1) , line)
//  }
  var i = 0
  while (i < lines.size/2){
    line = lines(i)
    lines.update(i, lines(lines.size - i -1))
    lines.update((lines.size - i - 1) , line)
    i+=1
  }

  for(i <- lines) println(i)
}