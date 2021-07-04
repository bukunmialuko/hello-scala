object Classes extends App {
  val u = new User()
  u.greet
  println(u.greet)

  val u1 = new User1("John")
  println(u1.greet)

  val userList = List(new User2("Shoto"), new User2("Art3mis"),
    new User2("Aesch"))

  val size = userList.map(_.name.size)
  println(size)

  val sorted = userList.sortBy(_.name)
  println(sorted)

  val three = userList.map(_.name contains("3"))
  println(three)
}


class User{
  val name:String ="James"
  def greet:String = s"Hello from $name"
}

class User1(val name: String){
  def greet:String = s"Hello from $name"
}

class User2(val name: String){
  def greet:String = s"Hello from $name"
  override def toString = s"User2($name)"
}
