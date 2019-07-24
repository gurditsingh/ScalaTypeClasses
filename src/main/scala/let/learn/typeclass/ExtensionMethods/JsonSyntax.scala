package let.learn.typeclass.ExtensionMethods

import let.learn.typeclass.TypeClassCreation.{Json, JsonWriter}

/**
  * Created by Bitwise on 7/17/2019.
  */
object JsonSyntax {

  implicit class JsonWriterOps[A](value:A){
    def toJson(implicit w:JsonWriter[A]): Json ={
      w.writer(value)
    }
  }
}
