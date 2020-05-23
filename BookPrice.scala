object BookPrice extends App {
  def cost(n:Int): Double = if (n <= 50) return (24.95-24.95*0.4)* n + 3
    else {
      return (24.95-24.95*0.4)* n + 3 + (n - 50) * 0.75
    }

   print("cost for copies :"+ cost(60))



}

