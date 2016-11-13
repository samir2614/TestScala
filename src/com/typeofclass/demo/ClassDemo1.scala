package com.typeofclass.demo

/**
  * Created by samir on 4/11/16.
  */
case class Point(x: Double = 0.0, y: Double = 0.0)
//
abstract class Shape() {
  /**
    * Draw takes a function argument. Each shape will pass a stringized
    * version of itself to this function, which does the "drawing".
    */
  def draw(f: String => Unit): Unit = f(s"draw: ${this.toString}")


}
case class Circle(center: Point, radius: Double) extends Shape
case class Rectangle(lowerLeft: Point, height: Double, width: Double)   extends Shape
case class Triangle(point1: Point, point2: Point, point3: Point)  extends Shape

object ClassDemo1 {

  def main(args: Array[String]): Unit = {
    val p00 = new Point
    println(p00)

    Point.apply(2.0,3.0)


    val p20 = new Point(2.0)
    val p20b = new Point(2.0)
    println(p20)
    val p02 = new Point(y = 2.0)
    println(p02)
    println("p00 == p20 : "+ (p00 == p20))
    p20 == p20b
    println("p20 == p20b : "+ (p20 == p20b))
    /*
       When we asked if p00 == p20 and p20 == p20b , Scala invoked the generated equals
       method. This is in contrast with Java, where == just compares references. You have to
       call equals explicitly to do a logical comparison
    */

    println(new Circle(p20,2.3))

  }
}
