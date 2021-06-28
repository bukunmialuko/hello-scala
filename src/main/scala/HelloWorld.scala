object HelloWorld extends App {
  def sayHello(string: String): Unit = {
    println("Hello " + string)
  }

  sayHello("Ejiro")

  val x: Int = 5

  val a = 3
  val b = 5
  if (a > b) {
    println("a > b")
  } else {
    println("a < b")
  }

  //  val day = "MONi"
  //  val week: Unit = day match {
  //    case "MON" | "TUE" => println("Weekday")
  //    case "SAT"  => println("Weekend")
  //    case _ => println("Undefined")
  //  }

  // pattern matching
  val leave = 25
  val week = leave match {
    case s if s <= 15 => println("Paid Leave")
    case s if s >= 15 => println("casual Leave")
    case s => println("Not Applicable")
  }
}

