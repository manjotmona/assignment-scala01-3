/**
 * Created by manjot on 10/1/18.
 */
object ForMain extends App{


  var obj = new Operations()
  val one = 1
  val two = 2
  val three = 3
  val four = 4
  val five = 5
  val six = 6
  val list = List(one,two,three,four,five,six)


  var result = obj.produceSum(list,list)
  print("Sum of 2 lists: " + result + "\n")

  print("Number of Elements: ")
  print(obj.numberOfElements(list) + "\n")

  print("Kth Element of list: ")
  print(obj.nthElementOfList(three,list) + "\n")

  print("Reverse List: ")
  obj.reverseList(list)
  print("\n")


  print("Double Elements of List: ")
  print(obj.doubleElements(list) + "\n")

  print("Fibonacci Series: ")
  obj.fibonacciForLoop(six)

  print("\n")
  print("Area of square :Input parameters are sides\n")
  print(obj.area("square",four,four,(a,b)=>a * b))

  print("\n")
  print("Area of rectangle: Input parameters are length and breadth\n")
  print(obj.area("rectangle",four,five,(a,b)=>a * b))
  print("\n")

  print("Area of rhombus: Input parameter are diagonals\n")
  print(obj.area("rhombus",four,four,(a,b)=>(a * b)/2))

  print("\nArea of parallelogram: Input parameters are base and height\n")
  print(obj.area("parallelogram",four,four,(a,b)=>a * b))

  print("\nArea of square\n")
  print(obj.area("square",one,four,(a,b)=>a * b))
}
