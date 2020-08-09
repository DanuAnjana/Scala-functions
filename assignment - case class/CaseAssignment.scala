object CaseAssignment extends App {
  val p1= Point(6,3)
  val p2= Point(5,4)
  println("Addition of point p1 and p2: " + p1.add(p2))

  println("Move point p1: "+p1.move(4,5))
  println("Move point p2: "+p2.move(4,5))

  println("Distance between point p1 and p2: "+p1.distance(p2))

  println("Invert of point p1: "+p1.invert())
  println("Invert of point p2: "+p2.invert())
}

case class Point(a:Int,b:Int){
  def x = a
  def y = b

  def add(p:Point)=Point(this.x+p.x, this.y+p.y)

  def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)

  def distance(p1:Point)= math.sqrt(math.pow(this.x - p1.x,2)+ math.pow(this.y-p1.y,2))

  def invert()=Point(this.y,this.x)
}
