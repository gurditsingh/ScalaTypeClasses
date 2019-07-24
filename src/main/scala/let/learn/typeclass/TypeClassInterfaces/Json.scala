package let.learn.typeclass.TypeClassInterfaces

import let.learn.typeclass.TypeClassCreation.{Json, JsonWriter}


object Json {

  def toJson[A](value:A)(implicit w:JsonWriter[A]): Json ={
    w.writer(value)
  }
}
