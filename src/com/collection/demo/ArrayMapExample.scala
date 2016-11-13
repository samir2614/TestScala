package com.collection.demo

/**
  * Created by samir on 13/11/16.
  */
object ArrayMapExample {
  def main(args: Array[String]): Unit = {
    //val greetStrings = new Array[String](3)
    val greetStrings = new Array[Any](4)

    greetStrings(0) = "Hi ! "
    greetStrings(1) = "Hello"
    greetStrings(2) = "Wow "
    greetStrings(3) = "Nice! "
    val t= greetStrings.map(x => x + " samir")
    for (i <- 0 to 3)
      println(t(i))
   println("---------------------------------------------------------------------")
    greetStrings(0)=0
    greetStrings(1)=1
    greetStrings(2)="samir"
    greetStrings(3)=5.0

    val t1= greetStrings.map(x => x + "1")
    for (z <-  t1)
      println(z)

    println("---------------------------------------------------------------------")
    val numbers =Array(1,2,3,4,5)
    var sum=0
    numbers.foreach(sum += _)
    println(sum)
    println("---------------------------------------------------------------------")
   //calling funiton with argument
    sum1(numbers)
    println("---------------------------------------------------------------------")




  }

  def sum1(args: Array[Int]):Unit={

    args.foreach(print)
    println("")
  }
}
