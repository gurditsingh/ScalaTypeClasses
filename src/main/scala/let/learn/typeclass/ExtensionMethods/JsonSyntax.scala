package let.learn.typeclass.ExtensionMethods

import let.learn.typeclass.TypeClassCreation.{Json, JsonWriter}

object JsonSyntax {

  implicit class JsonWriterOps[A](value:A){
    def toJson(implicit w:JsonWriter[A]): Json ={
      w.writer(value)
    }
  }
}
