import com.sun.org.apache.xpath.internal.operations.Bool

trait Shape {
  def area: Int

  def name = "Shape"
}

abstract class Car {
  val year: Int
  val automatic: Boolean = true

  def color: String
}

// Traits cannot create constructor
// Abstract class can be called from scala to java
// A class can extend multiple traits but only one abstract class

class Rectangle(width: Int, height: Int) extends Shape {
  override def area: Int = width * height

  override def name = "Rectangle"
}

trait Triangle extends Shape {
  def isRightAngle : Boolean
}

class RightAngleTriangle(adjacent :Int, opposite:Int) extends Triangle{
  override def isRightAngle: Boolean = true

  override def area: Int = (adjacent * opposite) / 2
}

object AbstractClassAndTraits extends App {
  //  val var1 = new Car() // abstract class cannot be instantiated

  val s = new Shape {
    override def area: Int = 20
  }

  println(s.area)
  println(s.name)

  val table = new Rectangle(5, 8)
  println(table.area)

  val table1 = new RightAngleTriangle(2,4)
  println(table1.area)
  println(table1.isRightAngle)
}

