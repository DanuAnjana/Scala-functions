object primeSequence extends App {
  def prime(p:Int,n:Int=2):Boolean={
    if(p<=2){
      if(p==2) return true
      else return false
    }
    else if(p%n==0) return false
    else if(n*n >p) return true
    return prime(p,n+1)

  }

  private def primeSeq(m:Int):Int={
    if(m<2){
      return 0
    }
    if(prime(m-1)){
     printf("%d\n",m-1)
  }
    primeSeq(m-1)
  }
  // this will not show given number even if it is a prime number.
  // only print all the prime number less than given number.
  primeSeq(10)

}
