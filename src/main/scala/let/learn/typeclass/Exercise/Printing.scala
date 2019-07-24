package let.learn.typeclass.Exercise

object Printing {

  def format[A](value:A)(implicit p:Printable[A]): String ={
    p.format(value)
  }

  def print[A](value:A)(implicit p:Printable[A]): Unit ={
    println(format(value)(p))
  }

}
