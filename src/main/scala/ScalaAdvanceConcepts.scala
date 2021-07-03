import scala.collection.mutable.ListBuffer

object ScalaAdvanceConcepts extends App {
  var numbers = List(32,95,24,21,17)
  println(numbers.size)
  println(numbers.head)
  println(numbers.tail)

//  numbers + = 65

  var fruits = new ListBuffer[String]()
  fruits += "Apple"
  fruits += "Banana"
  fruits += "Orange"

  val fruitList = fruits.toList
  println(fruitList)


  var total = 0
  for (i <- numbers){total += i}
  println(total)

  val range = List.range(1,5)
  println(range)

  val range1 = List.range(1,10,2)
  println(range1)

  val range2 = List.fill(5)("Hello")
  println(range2)

  val unique = Set(10,10,20,30)
  println(unique)

  var total1 = 0
  for (i <- unique){total1 += i}
  println(total1)

  println(unique(10))
  println(unique(6))

  //// Collections reducing lists

  var numbers1 = List(2,3,4)
  println(numbers1.fold(0)(_+_))
  println(numbers1.fold(0)((x,y) => x+y))

  println(numbers1.fold(10)((x,y) => x+y))
  println(numbers1.foldLeft(10)((x,y) => x-y))
  println(numbers1.foldRight(10)((x,y) => x-y))


  println(numbers1.reduce(_+_))
  println(numbers1.reduceLeft(_-_))
  println(numbers1.reduceRight(_-_))

  println("Scan")
  println(numbers1.scan(0)(_+_))
  println(numbers1.scanLeft(0)(_+_))
  println(numbers1.scanRight(0)(_+_))

  val a = Array(12,6,15,2,20,9)
  println(a.reduceLeft(_+_))


  val divide = (x:Double, y:Double)=>{
    val result = x/y
    result
  }

  val b = List(1.0,2.0,3.0)
  println(b.reduceLeft(divide))

  val product = (x:Int, y:Int)=>{
    val result = x*y
    result
  }

  val c = Array(1,2,3)
  println(c.scanLeft(10)(product).toList)
  println(c.scanRight(10)(product).toList)

  //// Collections reducing list


  // mathematical reduction operations
  println(c.min)
  println(c.max)
  println(c.product)
  println(c.sum)

  // boolean reduction operations
  println(c.contains(1))
  println(c.contains(5))

  println(c.endsWith(List(3)))
  println(c.endsWith(List(2,3)))
  println(c.endsWith(List(1,3)))
  println(c.endsWith(List(4)))

  println(c.exists(x => x<3))

  println("forall")
  println(c.forall(x => x<2))
  println(c.forall(x => x<3))
  println(c.forall(x => x<=3))

  println(c.forall(x => x<2))

  println("start with")
  println(c.startsWith(List(1,2)))


  // Map
  println("Map")

  val x = List(1,2,3,4,5,6,7,8,9)
  println(x.map(a => a*a))

  println("Flat Map")

  val fruits1 = Seq("apple", "banana","Orange")
  println(fruits1.map(x => x.toUpperCase()))

  println(fruits1.flatMap(x => x.toUpperCase()))

  println(fruits1.map(x => x.toUpperCase()).flatten)


  def toInt(string: String): Option[Int] = {
    try {
      Some(Integer.parseInt(string.trim))
    }catch {
      case e: Exception => None
    }
  }

  val strings = List("1", "2", "three","4")

  val mapResult = strings.map(toInt);
  println(mapResult)

  val mapResult1 = strings.flatMap(toInt);
  println(mapResult1)

  def g(v:Int) = List(v-1, v, v+1)

  val d = g(2)
  println(d)

  val y = List(1,2,3,4,5,6,7,8,9)
  println(y.map(x=>g(x)))
  println(y.flatMap(x=>g(x)))

}
