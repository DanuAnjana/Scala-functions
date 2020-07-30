object Question2 extends App {
  val x = new rational1(3,4)
  val y = new rational1(5,8)
  val z = new rational1(2,7)
  println(x.-(y).-(z))

}

class rational1(x:Int,y:Int) {
  private def gcd (a:Int,b:Int): Int= {if(b==0) a else gcd(b,a%b)}
  private val g= gcd(x,y).abs
  def numerator= x/g
  def denominator = y/g

  def +(r:rational1) = new rational1(this.numerator*r.denominator + r.numerator*this.denominator,this.denominator*r.denominator)
  def neg = new rational1(-this.numerator,this.denominator)
  def -(r:rational1) = this+r.neg
  override def toString: String = numerator + "/" + denominator

}




