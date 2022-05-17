

object main {

  def main(args: Array[String]): Unit = {

    val list1: List[Int] = List(7,1,6)
    val list2: List[Int] = List(5,9,2)

    val may16thsum = Week_Of_May_16th.sum_list(list1, list2)
    print("List Sum: ")
    may16thsum.foreach(print)

    val may16thmin = Week_Of_May_16th.stackMin(list2)
    println(s"\nStack Min: $may16thmin")

  }

  }
