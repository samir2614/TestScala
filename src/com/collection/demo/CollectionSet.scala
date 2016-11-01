package com.collection.demo

/**
  * Created by samir on 1/11/16.
  */
object CollectionSet {
  def main(args: Array[String]): Unit = {
    val numbers = Set(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
    for(x<-numbers) println(x)
  }
}
