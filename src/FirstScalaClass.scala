/**
  * Created by samir on 23/10/16.
  */
class Person(var name:String,var age:Int,var address:String){

    age=age+1;

}
class Animal(var name:String,var color:String){
     def printName() {

       println("Name: "+name);
       println("Color: "+color);

     }

}
object FirstScalaClass{
  def main(args:Array[String]): Unit ={

    val HOME = System.getProperty("user.home");
    println("HOME : "+HOME)
    val person=new Person("samir",33,"BLR");
    println("Person Name : "+person.name);
    println("Person Age : "+person.age);
    println("Person Address : "+person.address);

    new Animal("Dog","Pink").printName()
  }
}