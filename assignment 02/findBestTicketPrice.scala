import scala.io.StdIn.readInt
object findBestTicketPrice extends App {
  def changeAttendees(p:Int)= ((15-p)/5)* 20
  def noOfAttendees(p:Int)= 120+ changeAttendees(p)
  def income(p:Int)= p* noOfAttendees(p)
  def cost(p:Int)= 500 + 3* noOfAttendees(p)
  def profit(p:Int)= income(p)-cost(p)
  print("enter price for ticket :")
  var price= readInt()
  printf("profit when ticket price is %d : %d",price,profit(price))

}
