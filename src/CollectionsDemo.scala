/**
  * Created by samir on 1/11/16.
  */
import scala.collection.immutable
object CollectionsDemo {
  def main(args: Array[String]): Unit = {
    val arr= Array(1,2,3,4,5,6,7)

    println("***************************PRINT FOR LOOP******************************************")
    //print using for loop
    for(i<-0 to arr.length-1){
      print(arr(i)+" ")
    }
    println("\n---------------------------------")
    for (i<-0 until arr.length)
    print(arr(i)+" ")
    println("\n---------------------------------")
    for(i<-arr){
      print(i+" ")
    }
    println("\n---------------------------------")
    for{
      i<-0 to arr.length
      if i%2==0
    }print(i+" ")
    println("\n---------------------------------")

    val v1=for (e <- arr if e > 2) yield e % 2
    for(x <- v1) print(x+" ")
    println("\n---------------------------------")

    println("***************************END FOR LOOP******************************************")

  }


}
