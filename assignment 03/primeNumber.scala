import scala.io.StdIn.readInt
object primeNumber extends App {
  def prime(p:Int,n:Int=2):Boolean={
    if(p<=2){
      if(p==2)  return true
      else return false
    }
    else if(p%n==0) return false
    else if(n*n >p) return true
    return prime(p,n+1)

    }
  print("enter number :")
  var primeNo= readInt()
  print(prime(primeNo))

}
