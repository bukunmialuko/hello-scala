
object CaseClassRunner extends App {

  val frank = Book("TST9999")
  println(frank.isbn)

  val message = Message("Lorem", "Ipsum")
  println(message.sender)
  println(message.recipient)

  val message1 = Message("Lorem", "Ipsum")
  println(message == message1)

  val message2 = MessageNN("Lorem", "Ipsum","Message Body")
  println(message2)

  val message3 = message2.copy()
  println(message3)

  val message4 = message2.copy(sender = "OBKM")
  println(message4)
}
