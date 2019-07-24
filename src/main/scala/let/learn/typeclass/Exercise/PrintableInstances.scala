package let.learn.typeclass.Exercise

/**
  * Created by Bitwise on 7/17/2019.
  */
object PrintableInstances {

  implicit val stringFormat:Printable[String]=new Printable[String] {
    override def format(value: String) =
      value.toUpperCase.toString
  }

  implicit val intFormat:Printable[Int]=new Printable[Int] {
    override def format(value: Int) =
      value.toString
  }
}
