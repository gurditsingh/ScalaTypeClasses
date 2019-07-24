package let.learn.typeclass.TypeClassInterfaces

import let.learn.typeclass.TypeClassCreation.{Json, JsonWriter}

/**
  * Created by Bitwise on 7/17/2019.
  */
object Json {

  def toJson[A](value:A)(implicit w:JsonWriter[A]): Json ={
    w.writer(value)
  }
}
