package let.learn.typeclass.Exercise

/**
  * Created by Bitwise on 7/17/2019.
  */
trait Printable[A] {

  def format(value:A):String
}
