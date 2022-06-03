object Week_Of_June_1st {

  def IsValidHexCode(input: String): Boolean = {
    var output = false

    var inputList = input.split("")
    val numberrange = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    val letterrange = List("A", "B", "C", "D", "E", "F", "a", "b", "c", "d", "e", "f")
    val numberrangelegnth = numberrange.length
    val letterrangelength = letterrange.length
    var checks = 0

    if (inputList.length == 7) {
      checks += 1
      //println(s"length = 6: $checks ")
      if (inputList(0) == "#") {
        checks += 1
        //println(s"checking #: $checks")
        for (i <- 1 until inputList.length) {
          for (e <- 0 until numberrangelegnth) {
            if (inputList(i) == numberrange(e).toString) {
              checks += 1
              //println(s"checking the numbber range: $checks ::: numberrange " + numberrange(e) + "input number ::: " + inputList(i))
            }
          }
          for (k <- 0 until letterrangelength) {
            if (inputList(i) == letterrange(k)) {
              checks += 1
              //println(s"Checking the letter range: $checks ::: numberrange " + letterrange(k) + " input letter ::: " + inputList(i))
            }
          }
        }
      }

      else {
        return output
      }
    }
    else {
      return output
    }

    if (checks == 8) {
      output = true
    }


    return output
  }

  def NextPrime(input: Int): Int = {
    var output = 0
    var count = 0
    var overflow = input
    var done = false


    for(i <- 1 to input)
      {
        if(input % i == 0)
        {
          //println(s"This is the count $count")
          count = count + 1
        }
      }
    if(count==2)
      {
        output = input
      }
    else{
      while(!done)
        {
          var count2 = 0
          overflow = overflow + 1
          //println(s"the overflow number: $overflow")
          for(i <- 1 to overflow)
            {
              if(overflow % i == 0)
                {
                  count2 +=1
                  //println(s"This is the count2: $count2")
                }

            }
            if(count2 == 2) {
              output = overflow
              done = true
            }
            else if(count2 >10)
              {
                done = true
              }
        }

    }







    output
  }
}
