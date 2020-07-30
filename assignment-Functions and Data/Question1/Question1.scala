object Question1 extends App {
  val x= new Rational2(1,2)
  println(x.neg)
}

class Rational2(x:Int,y:Int){
  def numerator = x
  def denominator= y

  def neg = new Rational2(-this.numerator,this.denominator)

  override def toString: String = numerator + "/" + denominator
}
