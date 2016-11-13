package com.com.function

/**
  * Created by samir on 13/11/16.
  */
/*
In this example, the method decorator.layout is coerced automatically to a value of type Int => String as required by method apply.
 Please note that method decorator.layout is a polymorphic method (i.e. it abstracts over some of its signature types) and
 the Scala compiler has to instantiate its method type first appropriately.
*/
class Decorator(left: String, right: String) {
  def layout[A](x: A) = left + x.toString() + right
}

object higherOrderFun {
/*These are functions that take other functions as parameters, or whose result is a function.
Here is a function apply which takes another function f and a value v and applies function f to v:
*/
  def apply(f: Int => String, v: Int) = f(v)

  def main(args: Array[String]): Unit = {
    def apply(f: Int => String, v: Int) = f(v)
    val decorator = new Decorator("[", "]")
    println(apply(decorator.layout, 7))

  }
}
