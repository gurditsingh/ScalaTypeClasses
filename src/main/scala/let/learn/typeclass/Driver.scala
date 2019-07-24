package let.learn.typeclass

import let.learn.typeclass.TypeClassInstances.Person
import let.learn.typeclass.TypeClassInterfaces.Json

object Driver {


  def main(args: Array[String]): Unit = {

    import TypeClassInstances.JsonWriterInstances._

    Json.toJson(Person("Gurdit", "gurdit.singh@abc.com"))

    Json.toJson(Person("Gurdit", "gurdit.singh@abc.com"))(personWriter)

    import ExtensionMethods.JsonSyntax._

    Person("Gurdit", "gurdit.singh@abc.com").toJson
  }
}
