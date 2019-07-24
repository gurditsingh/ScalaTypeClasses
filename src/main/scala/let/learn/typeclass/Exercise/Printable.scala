package let.learn.typeclass.Exercise

trait Printable[A] {

  def format(value:A):String
}
