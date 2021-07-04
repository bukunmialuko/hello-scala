object Inheritance extends App {

  val hiA = new A().hi
  println(hiA)

  val hiB = new B().hi
  println(hiB)

  val hiC = new C().hi
  println(hiC)

  val hiD = new D().hi
  println(hiD)


}

class A {
  def hi = "Hello from A"
}

class B extends A

class C extends B { override  def hi = super.hi}

class D extends C { override  def hi = "Hello from D"}