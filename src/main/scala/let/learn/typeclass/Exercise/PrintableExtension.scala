package let.learn.typeclass.Exercise

/**
  * Created by Bitwise on 7/17/2019.
  */
object PrintableExtension {

  implicit class PrintingOps[A](value:A){

    def format(implicit p:Printable[A]): String={
      p.format(value)
    }

    def print(implicit p:Printable[A]): Unit={
      println(p.format(value))
    }
  }
}
