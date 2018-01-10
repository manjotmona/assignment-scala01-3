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
  print("Sum of 2 lists:" + result+ "\n")

print("")
  print(obj.numberOfElements(list))


}
