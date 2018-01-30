def isEven(problem: Int): Int = {
  var sum: Int = 0
  var temp: Int = 2
  var tempFibo: Int = Fibo(temp)
  while(tempFibo <= problem) {
    if (Fibo(temp) % 2 == 0) {
      sum += Fibo(temp);
      println(Fibo(temp) + " is even fibo and sum is " + sum)
    }
    temp += 1
    tempFibo = Fibo(temp)
  }
  return sum
}

def Fibo(checkedNumber: Int): Int = {
  if (checkedNumber < 2) {
    return checkedNumber
}  else {
  var x = Fibo(checkedNumber-1)
  var y = Fibo(checkedNumber-2)
  return (x+y)
    }
}

println(isEven(4000000))
