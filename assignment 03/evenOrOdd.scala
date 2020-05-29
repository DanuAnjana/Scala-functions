import scala.io.StdIn.readInt
import scala.io.StdIn.readLine
object evenOrOdd extends App {
  def isEven(n:Int): Boolean= n match {
    case 0 => true
    case _ => isOdd(n-1)
  }
  def isOdd(n: Int):Boolean= {
    !(isEven(n))
  }

  def printEvenOrOdd()={
    print("enter number :")
    var num= readInt()
    print("Do you want to determine even or odd : ")
    var s= readLine()
    if(s=="even")
      if(isEven(num)) print("even") else print("not even. odd")
    else
      if(isOdd(num)) print("odd") else print(" not odd. even")

  }
  printEvenOrOdd()
}
