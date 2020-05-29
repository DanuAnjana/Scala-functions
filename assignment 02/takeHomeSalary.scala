object takeHomeSalary extends App {
  def income(normal :Int, OT : Int)= normal*150 + OT*75
  def tax(income:Int)= income*0.1
  def salary(normal :Int, OT:Int) = income(normal,OT) - tax(income(normal,OT))
  printf("the take home salary is : %.2f", salary(40,20))
}
