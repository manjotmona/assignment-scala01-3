import scala.collection.mutable.ListBuffer

/**
 * Created by manjot on 10/1/18.
 */
class Operations {

  def sum(first: Int, second: Int, f: (Int,Int) => Int) = {
    f(first, second)
  }


  def produceSum(list1: List[Int], list2: List[Int]): List[Int] ={
    val list = new ListBuffer[Int]()


         for(x <- 0 to list1.length-1) {
           list += sum(list1(x),list2(x),(a,b)=>a + b)
         }
        val nList = list.toList
        nList

      }

  def fibonacci(n: Int): Int = {
    def fibonacciRecursive(n: Int, a: Int, b: Int): Int = n match {
      case 0 => a
      case _ => fibonacciRecursive(n-1,b,a + b)
    }
    return fibonacciRecursive(n, 0 , 1)
  }


  def area(shape: String, first: Int, second: Int, f:(Int,Int) => Int): String = {
    shape match{
      case "square" => "Area of" + shape + "is " + f(first,second)
      case "rectangle" => "Area of" + shape + "is " + f(first,second)
      case "rhombus" => "Area of" + shape + "is " + f(first,second)
      case "parallelogram" => "Area of" + shape + "is " + f(first,second)
      case _ => "We can't calculate area of this shape !!"

    }
    "Area of" + shape + "is " + f(first,second)
  }



  def doubleElements(list: List[Int]): List[Int] ={
    val newList = list.map(x => 2 * x)
    newList

  }

  def nthElementOfList(position: Int, list: List[Int]): Int = {
    list match {
      case head :: tail if (position == 0) => head
      case head :: tail if (position >0 ) => nthElementOfList(position-1,tail)

    }

  }

  def numberOfElements(list: List[Int]): Int = {
    list match {
      case Nil => 0
      case head :: tail => 1 + numberOfElements(tail)
    }

  }

  def reverseList(list: List[Int]): Unit ={
    for(x <- 0 to list.length-1){
    print(list(list.length-x-1))
    }


  }





}
