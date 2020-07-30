object Question4 extends App{
  var a1= new account2("976545123V",100001,20000)
  var a2= new account2("976748234V",100002,12000)
  var a3= new account2("966585567V",100003,-12.12)
  var a4= new account2("991256738V",100004,-34.45)
  var a5= new account2("967856234V",100005,-10.50)
  var a6= new account2("989148890V",100006,3500.60)

  val bank:List[account2]= List[account2](a1,a2,a3,a4,a5,a6)

  val find=(id:String,bank:List[account2]) => bank.filter(ac=>ac.nic.equals(id))
  val overdraft=(bank:List[account2]) => bank.filter(ac=>ac.balance<0)
  val balance=(bank:List[account2]) => bank.reduce((ac1,ac2)=> new account2(ac1.nic,ac1.acnumber,ac1.balance+ac2.balance))
  val interest=(bank:List[account2]) => bank.map(ac=>if(ac.balance>0) ac.balance*1.05 else ac.balance*1.1)

  println("\nList of accounts with negative balance: "+ overdraft(bank))
  println("\nsum of all account balance Rs: "+ balance(bank).balance)
  println("\nFinal balance of all accounts after apply the interest:"+ interest(bank))
}

class account2(id:String,n:Int,b:Double){
  val nic:String=id
  val acnumber:Int=n
  val balance: Double= b

  override def toString: String = "["+nic+":"+acnumber +":"+ balance+"]"
}
