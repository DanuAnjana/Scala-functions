object fibonacci extends App {
  def fib(n:Int):Int={
    if(n==0) return 0
    else if (n==1) return 1
    else return (fib(n-1)+fib(n-2))
  }
  def fibSeq(n:Int): Unit={
    if(n>0) fibSeq(n-1)
    println(fib(n))
  }

  fibSeq(10)



}
