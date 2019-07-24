package let.learn.typeclass.TypeClassCreation


trait Json
case class JsObject(get:Map[String,Json]) extends Json
case class JsString(get:String) extends Json
case class JsNumber(get:Double) extends Json

trait JsonWriter[A]{
  def writer(value:A):Json
}
