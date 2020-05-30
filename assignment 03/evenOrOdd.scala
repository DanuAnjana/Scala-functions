object evenOrOdd extends App {
  def isEven(n: Int): Boolean = n match {
    case 0 => true
    case _ => isOdd(n - 1)
  }

  def isOdd(n: Int): Boolean = {
    !(isEven(n))
  }

  print(isEven(10))
  printf("\n")
  print(isOdd(9))
}



