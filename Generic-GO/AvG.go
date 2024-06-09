package main

import (
	"fmt"
)

type AvG[T any] struct{}

func NewAvGInt(array []int) AvG[int] {
	sum := 0.0
	for _, item := range array {
		sum += float64(item)
	}
	average := sum / float64(len(array))
	fmt.Println("The Average:", average)
	return AvG[int]{}
}

func NewAvGFloat(array []float64) AvG[float64] {
	sum := 0.0
	for _, item := range array {
		sum += item
	}
	average := sum / float64(len(array))
	fmt.Println("The Average:", average)
	return AvG[float64]{}
}

func main() {
	integers := []int{1, 2, 3, 4, 5, 6, 7, 8, 9}
	NewAvGInt(integers)

	doubles := []float64{2.2, 3.3, 4.4, 5.5, 6.6}
	NewAvGFloat(doubles)
}
