package main

import (
	// "fmt"
	"sort"
)

type Comparable interface {
	LessThan(other interface{}) bool
}

type Max[T Comparable] struct {
	data []T
}

func NewMax[T Comparable](t []T) *Max[T] {
	return &Max[T]{data: t}
}

func (m *Max[T]) FindMax() T {
	sort.Slice(m.data, func(i, j int) bool {
		return m.data[i].LessThan(m.data[j])
	})
	return m.data[len(m.data)-1]
}

// Int and Float64 are types that satisfy the Comparable interface.
type Int int
type Float64 float64

func (i Int) LessThan(other interface{}) bool {
	return i < other.(Int)
}

func (f Float64) LessThan(other interface{}) bool {
	return f < other.(Float64)
}

// func main() {
// 	integers := []Int{1, 2, 3, 45, 65, 97}
// 	maxInt := NewMax(integers)
// 	fmt.Printf("The largest of type is: %v\n", maxInt.FindMax())

// 	doubles := []Float64{999.0, 9862.0, 667.2, 97.85}
// 	maxDouble := NewMax(doubles)
// 	fmt.Printf("The largest of type is: %v\n", maxDouble.FindMax())
// }
