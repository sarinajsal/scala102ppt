object HOFs extends App {

  def math(x:Int, y:Int, function:(Int, Int) => Int): Int ={
    function(x,y)
  }

  val result = math(1,2,(x,y)=>x*y)
  println(result)

//  def circleArea (r: Double): Double = 3.14 * r * r
//  def circumference(r:Double): Double = 2 * 3.14 * r
//
//  def hof (func1: (Double)=>Double, listOfRadii: List[Double]): List[Double] = {
//  val a = func1(listOfRadii.head)
//    val list: List[Double] :: [a]
//
//
//  }
  val pi = 3.14


  val calcCircumference: (Double) => Double = radius => 2 * pi * radius //explicit return syntax
  val anotherWrittenWay = (rad: Double) => 2 * pi * rad //implicit return syntax

  val calcArea: (Double) => Double = (radius) => radius * radius * pi //explicit
  val calcAreaImplicit = (r: Double) => r * r * pi //implicit

  // function that takes a list of radii as a param and either the area or circumference functions
  // outputs a list of circle areas or circumferences

  def hof (func: Double => Double, list: List[Double]): List[Double] = {
    list.map(func)
  }
  //val radiusList = (2.00, 2.13)
  val res = hof(calcArea, List(2.00,1.00))
  println(res)



  //NB FUNCTION SYNTAX NOTATION - EXPLICIT AND IMPLICIT




}
