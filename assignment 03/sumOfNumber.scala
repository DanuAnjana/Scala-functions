object sumOfNumber extends App {
  var sum:Int=0
  def sumNumber(n:Int):Int={
    if(n!=0) return n + sumNumber(n-1)
    else return n
  }
  print(sumNumber(5))
}
