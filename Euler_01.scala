def result(): Int = {
  var sum: Int = 0
  for (x <- Range(0, 1000)) {
    if ((x % 3 == 0) || (x % 5 == 0) && (x % 15 != 0)) {
      sum += x
    }
    println(sum)
  }
  return sum
}

println(result())
