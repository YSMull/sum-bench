object Main {

  def time[R](block: => R): R = {
    val t0 = System.nanoTime()
    val result = block // call-by-name
    val t1 = System.nanoTime()
    println("Elapsed time: " + (t1 - t0) / 1000000 + "ms")
    result
  }

  def perform(): Unit = {
    var a = 0L
    for (i <- 1 to 10000000) {
      a += i
    }
    println(a)
  }

  def main(args: Array[String]): Unit = {
    time {
      perform()
    }
    time {
      perform()
    }
    time {
      perform()
    }
    time {
      perform()
    }
    time {
      perform()
    }
    time {
      perform()
    }
    time {
      perform()
    }
    time {
      perform()
    }
    time {
      perform()
    }
    time {
      perform()
    }
  }
}