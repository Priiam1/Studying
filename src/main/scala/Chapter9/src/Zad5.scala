import java.io.PrintWriter
import scala.math._

object Zad5 extends App {
  val out = new PrintWriter("resorses\\PowersOfTwo.txt")
  for ( i <- 0 to 20){
    //out.print(1 + "     " + 1)
    out.println(1 * pow(2, i) + "     " + 1/ pow(2, i))

  }
  out.close()
}
