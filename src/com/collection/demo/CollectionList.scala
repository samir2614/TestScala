package com.collection.demo

/**
  * Created by samir on 1/11/16.
  */
class Person(val name: String, val female: Boolean,val age:Int){

  override def toString: String = {
   // println(s"Name: $name")
   // println(s"Female: $female")
    return ("name : "+name +" Female: "+female+" Age: "+age)
  }
}


object CollectionList {

  def main(args: Array[String]): Unit = {

    val people = List(
      new Person("Cliff Barnes", false,18),
      new Person("J. R. Ewing", false,60),
      new Person("Sue Ellen Ewing", true,55),
      new Person("Ellie Ewing", true,25),
      new Person("Bobby Ewing", false,59),
      new Person("Donna Culver Krebbs", true,22))
    print(people)
    println("\n----------------------------------------------")

    for(x<-people) println(x)

    println("\n----------------------------------------------")

    val person2=for(x<-people if x.age>55)yield x
    for(x<-person2) println(x)
     println("\n----------------------------------------------")

    val outsiders = List(
              new Person("Cliff Barnes", false,77),
            new Person("Donna Culver Krebbs", true,56))

    val groups = List(person2, outsiders)
    for(x1<-groups) println(x1)
     println("\n----------------------------------------------")


    }
  }
