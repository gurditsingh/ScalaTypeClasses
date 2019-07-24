package let.learn.typeclass.Exercise

/**
  * Created by Bitwise on 7/17/2019.
  */
object Driver {

  def main(args: Array[String]): Unit = {

    import PrintableInstances._

    Printing.format("Hello")
    Printing.print("Hello")

    import PrintableExtension._

    "hello".print
  }

}
