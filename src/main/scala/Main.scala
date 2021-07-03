object Main {
  def main(args: Array[String]) {
    println("Hello World")
    cCount("Lorem Ipsum")
    addInt(10,20)

    val l = List(4,5,6,7)
    val x = l.reduce(_+_)
    println(x)
  }

  def cCount(string: String) {
    val text_size = string.size
    println(text_size)
  }

  def addInt(a:Int, b: Int){
    println(a+b)
  }
}

