package com.com.fold

/**
  * Created by samir on 14/11/16.
  */
/* Fold in java code
T accumulator = initialValue;
for(X listItem : list){
    accumulator = method(accumulator, listItem);
}
return accumulator;


HELP: http://alvinalexander.com/scala/how-to-walk-scala-collections-reduceleft-foldright-cookbook
* */
object Fold {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3)
    val sum=list.foldLeft(0)(_ + _)
    println("sum : "+sum)

    val sum1=list.foldRight(0)(_ + _)
    println("sum1 : "+sum1)
  }

}
