object Question3 extends App {
  val Ac1= new Account1("976782038V",7001234,20000)
  val Ac2= new Account1("964567123V",7002341,10000)
  println("Before transfer money")
  println(Ac1)
  println(Ac2)
  println("\nAfter transfer money")
  Ac1.transfer(Ac2,10000)
  println(Ac1)
  println(Ac2)

}

class Account1(id:String,n:Int,b:Double){
  val nic = id
  val accountNo = n
  var balance = b

  def withdraw(b:Double) = this.balance-=b
  def deposit(b:Double) = this.balance+=b

  def transfer(a:Account1,b:Double)={
    this.withdraw(b)
    a.deposit(b)
  }

  override def toString: String = "[NIC:"+nic+" ,Account number:"+accountNo +" ,Balance:"+ balance+"]"

}