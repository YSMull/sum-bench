object Main {

  def perform(n: Int): Long = {
    var s = 0L
    for (i <- 1 to n) {
      s += i
    }
    s
  }

  def main(args: Array[String]): Unit = {
    val inputs = "10000000\n10000000\n10000000\n10000000\n10000000\n10000000\n10000000\n10000000\n10000000\n10000000\n10000000\n10000000"
    val numbers = inputs.split("\n").map(Integer.parseInt)
    for (n <- numbers) {
      val t0 = System.nanoTime()
      val result = perform(n)
      val t1 = System.nanoTime()
      println(s"$result Elapsed time: " + (t1 - t0) / 1000000.0 + "ms")
    }
  }
}