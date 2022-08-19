package main

import "time"

func main() {
	start := time.Now()
	var sum = 0
	for i := 1; i <= 10000000; i++ {
		sum += i
	}
	duration := time.Since(start)
	println(duration.Milliseconds())
}
