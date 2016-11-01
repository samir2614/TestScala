package com.collection.demo

/**
  * Created by samir on 1/11/16.
  */
object CollectionTuple {
  def getUserInfo = ("Al", 42, 200.0)
  val(name, age, weight) = getUserInfo


  //if you only want to access some of the elements, you can ignore the others by using an underscore placeholder
  // for the elements you want to ignore. Imagine you want to ignore the weight in our example:

  val(name1, age1, _) = getUserInfo

  val t = ("Al", 42, 200.0)


  def main(args: Array[String]): Unit = {
    val tupleVal = ("samir", 30,"blr")
    println(tupleVal._1+" ,"+tupleVal._2+" "+tupleVal._3)

    t.productIterator.foreach(println)
    //name1 from tuple above
    println(name1)

  }
}
