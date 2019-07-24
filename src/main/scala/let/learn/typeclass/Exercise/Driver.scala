package let.learn.typeclass.Exercise

object Driver {

  def main(args: Array[String]): Unit = {

    import PrintableInstances._

    Printing.format("Hello")
    Printing.print("Hello")

    import PrintableExtension._

    "hello".print
  }

}
