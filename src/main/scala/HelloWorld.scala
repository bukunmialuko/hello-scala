object HelloWorld extends App {
  val emplSalary = totalSalary(450, 234)

  sayHello("Ejiro")

  //  val x: Int = 5

  //  val a = 3
  //  val b = 5
  //  if (a > b) {
  //    println("a > b")
  //  } else {
  //    println("a < b")
  //  }

  //  val day = "MONi"
  //  val week: Unit = day match {
  //    case "MON" | "TUE" => println("Weekday")
  //    case "SAT"  => println("Weekend")
  //    case _ => println("Undefined")
  //  }

  // pattern matching
  //  val leave = 25
  //  val week = leave match {
  //    case s if s <= 15 => println("Paid Leave")
  //    case s if s >= 15 => println("casual Leave")
  //    case s => println("Not Applicable")
  //  }

  // for loops
  //  for(i <- 1 until 5) println(i)

  // for loop iterator guard
  //  for(i <- 1 until 5 if i < 5) println(i)

  // nested iterator
  //  for(a <- 1 to 2; b <- 1 to 3) println(a, b, )

  //  while loop
  //  var line = 0
  //  var maximum_lines = 3
  //
  //  while (line < maximum_lines){
  //    line = line + 1
  //    println("Line number: "+line)
  //  }

  // strings
  //  val w = "lorem world"
  //  println(f"$w%.4s")

  // procedure
  //  def logImplicit(d: Double) = println(f"Got value $d%.4f")
  //  val x = logImplicit(2.456766)

  //Nested function
  //  def min (x: Int ,y: Int,z: Int) = {
  //    def minInside(i: Int, j: Int) = if(i<j) i else j
  //    minInside(x, minInside(y,z))
  //  }
  //  println(min(34,54,35))
  val commonSalary = totalSalary(450, _: Int)
  val emp2Salary = commonSalary(250)
  println(emplSalary)
  val emp3Salary = commonSalary(200)
  println(commonSalary)

  def sayHello(string: String): Unit = {
    println("Hello " + string)
  }
  println(emp2Salary)

  // partially applied function
  def totalSalary(basic: Int, variableSal: Int) = {
    basic + variableSal
  }
  println(emp3Salary)
}

