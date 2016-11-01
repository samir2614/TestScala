package com.collection.demo

/**
  * Created by samir on 1/11/16.
  */
object CollectionCaseMatch {

  case class Address(street: String, city: String, country: String)

  case class Person(name: String, age: Int, address: Address)


  def main(args: Array[String]): Unit = {
    for {
      x <- Seq(1, 2, 3, 2.7, "one", "two", 'four) // 1
    }
    {
      val str = x match {                                                // 2
        case 1          => "int 1"                                       // 3
        case i: Int     => "other int: "+i                               // 4
        case d: Double  => "a double: "+x                                // 5
        case "one"      => "string one"                                  // 6
        case s: String  => "other string: "+s                            // 7
        case unexpected => "unexpected value: " + unexpected             // 8
      }
      println(str)                                                       // 9
    }

    /*
    1. Because of the mix of values, the list is of type Seq[Any].
    2. The x is of type Any.
    3. Match if x equals 1.
    4. Match any other Int value. Safely cast the value of x to an Int and assign to i.
    5. Match any Double, where the value of x is assigned to the Double variable d.
    6. Match the String “one”.
    7. Match any other String, where the value of x is assigned to the String variable s.
    8. Match all other inputs, where unexpected is the variable to which the value of x is assigned.
       Because no type annotation is given, Any is inferred. This functions as the “default” clause.
    9. Print the returned String.
    */
    println("--------------------------------------------------------------------------------------")
    //Other example
    val langs = Seq(
      ("Scala",   "Martin", "Odersky"),
      ("Clojure", "Rich",   "Hickey"),
      ("Clojure1", "samir",   "Hickey1"),
      ("Lisp",    "John",   "McCarthy"))

    for (tuple <- langs) {
      tuple match {
        case ("Scala", _, _) => println("Found Scala")                   // 1
        case (_,"samir",_) => println(s"Found Samir ")
        case (lang, first, last) => println(s"Found other language: $lang ($first, $last)")  // 2

      }
    }
    /*
        1. Match a three-element tuple where the first element is the string “Scala” and we ignore the second and third arguments.
        2. Match any three-element tuple, where the elements could be any type, but they are inferred to be Strings due to the input langs.
           Extract the elements into variables lang, first, and last.

    * */
    println("-----------------------------------------------------------------------------------")
    for (i <- Seq(1,2,3,4)) {
      i match {
        case _ if i%2 == 0 => println(s"even: $i")                       // 1
        case _             => println(s"odd:  $i")                       // 2
      }
    }

    /*
       1. Match only if i is even. We use _ instead of a variable, because we already have i.
       2. Match the only other possibility, that i is odd.
    */
    println("-----------------------------------------------------------------------------------")

    val alice   = Person("Alice",   25, Address("1 Scala Lane", "Chicago", "USA"))

    val bob     = Person("Bob",     29, Address("2 Java Ave.",  "Miami",   "USA"))

    val charlie = Person("Charlie", 32, Address("3 Python Ct.", "Boston",  "USA"))


    for (person <- Seq(alice, bob, charlie))
    {
      person match {
        case Person("Alice", 25, Address(_, "Chicago", _)) => println("Hi Alice!")
        case Person("Bob", 29, Address("2 Java Ave.", "Miami", "USA")) =>println("Hi Bob!")
        case Person(name, age, _) =>  println(s"Who are you, $age year-old person named $name?")
      }
    }


    println("-----------------------------------------------------------------------------------")

  }
}












