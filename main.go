package main

import (
	"strconv"
	"strings"
	"time"
)

func perform(n int) int {
	sum := 0
	for i := 0; i < n; i++ {
		sum += i
	}
	return sum
}

func main() {
	s := "10000001\n10000001\n10000001\n10000001\n10000001\n10000001\n10000001\n10000001\n10000001\n10000001"
	m := strings.Split(s, "\n")

	for i := 0; i < len(m); i++ {
		n, _ := strconv.Atoi(m[i])
		start := time.Now()
		result := perform(n)
		duration := time.Since(start)
		println(result, duration.Nanoseconds())
	}
}
