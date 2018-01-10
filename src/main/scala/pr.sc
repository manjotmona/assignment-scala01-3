def reverseList(list: List[Int]): Unit ={
  for(x <- 0 to list.length-1){
    print(list(list.length-x-1))
  }


}



val l = List(1,2,3,4,6)

reverseList(l)