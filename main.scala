object Main {

  def time[R](block: => R): R = {
    val t0 = System.nanoTime()
    val result = block
    val t1 = System.nanoTime()
    println("Elapsed time: " + (t1 - t0) / 1000000.0 + "ms")
    result
  }

  def perform(n: Int): Long = {
    var s = 0L
    for (i <- 1 to n) {
      s += i
    }
    println(s)
    s
  }

  def main(args: Array[String]): Unit = {
    val inputs = "10000000\n10000000\n10000000\n10000000\n10000000\n10000000\n10000000\n10000000\n10000000\n10000000\n10000000\n10000000"
    val numbers = inputs.split("\n").map(Integer.parseInt)
    for (n <- numbers) {
      time {
        perform(n)
      }
    }
  }
}