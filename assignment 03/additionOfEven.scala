import scala.io.StdIn.readInt
object additionOfEven extends App {
  var sum:Int=0
  def findEven(n:Int): Boolean={
    if(n%2==0) return true
    else
      return false
  }
  def sumEven(n:Int):Int={
    if(n<2) return sum
    if(findEven(n-1)){
      sum = sum + n-1
    }
    sumEven(n-1)
  }
  print("enter number :")
  var s= readInt()
  // this will not add given number even if it is even.
 // only add all the even number less than given number
  print(sumEven(s))

}
