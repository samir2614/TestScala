/**
  * Created by samir on 24/10/16.
  */
class Pizza {

  var crustSize = 12
  var crustType = "Thin"

  def this(crustSize: Int) {
    this()
    this.crustSize = crustSize
  }

  def this(crustSize: Int, crustType: String) {
    this(crustSize)
    this.crustType = crustType
  }

  override def toString = {
    "A %s inch pizza with %s crust.".format(crustSize, crustType)
  }

}

object ScalaSecondClass extends App {
  println(new Pizza)
  println(new Pizza(14))
  println(new Pizza(16, "Thick"))
}
