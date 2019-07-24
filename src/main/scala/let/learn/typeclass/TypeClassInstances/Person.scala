package let.learn.typeclass.TypeClassInstances

import let.learn.typeclass.TypeClassCreation.{JsObject, JsString, JsonWriter}

case class Person(name:String,email:String)

object JsonWriterInstances{


  implicit val stringWriter:JsonWriter[String] = new JsonWriter[String] {
    override def writer(value: String) =
      JsString(value)
  }

  implicit val personWriter:JsonWriter[Person]=new JsonWriter[Person] {
    override def writer(value: Person) =
      new JsObject(Map(
        "name" -> JsString(value.name),
        "email" -> JsString(value.email)
      ))
  }

}