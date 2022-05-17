import scala.collection.mutable


object Week_Of_May_16th {

  def sum_list(list1:List[Int], list2:List[Int]): List[String] ={
    val s = mutable.Stack[Int]()
    var intString1 = new String
    var intString2 = new String
    val listCount1 = list1.length
    val listCount2 = list2.length

    var count = 0
    for(i <- 0 until listCount1)
      {
        //println(list1(i))
        s.push(list1(i))

      }
    while(count < listCount1)
      {
        intString1 += s.pop.toString

        count = count + 1
      }

    count = 0
    for(i <- 0 until listCount2)
    {
      //println(list2(i))
      s.push(list2(i))

    }
    while(count < listCount2)
    {
      intString2 += s.pop.toString
      count = count + 1
    }
    //println(intString1)
    //println(intString2)
    val sumString = (intString1.toInt + intString2.toInt).toString
    val sumList = sumString.split("").map(_.trim).toList

    return sumList
  }

  def stackMin(input:List[Int]): Int =
  {
    val s = mutable.Stack[Int]()
    val min = mutable.Stack[Int](1)
    var minnum = -404
    val countLength = input.length

    for(i <- 0 until countLength)
      {
        if(minnum == - 404)
          {
            minnum=input(i)

          }
        else if(minnum > input(i))
          {
            minnum = i
          }
        s.push(input(i))

      }
      min.push(minnum)

    val output = min(0)
   return output
  }




}
