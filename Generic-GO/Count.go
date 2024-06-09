package main

import"fmt"

func main()  {
	integers := []int{1, 2, 3, 4, 5, 6, 7, 8, 9}
	count(integers)
}

func count(array []int) {
	CountEven(array)
	CountPrime(array)
}

func CountEven(array []int) {
	total:=0
	for _, item := range array {
		if item%2==0 {
			total++
		}
	}
	fmt.Println("The total number of even is",total)
}

func CountPrime(array []int){
	count:=0

	for _, item2 := range array {
		if IsPrime(item2) {
			count++
		}
	}

	fmt.Println("The amount of prime is",count)
}

func IsPrime(kbd int) bool {
	if kbd<=1 {
			return false
	}
	for i := 2; i <= kbd/2; i++ {
		if kbd%i == 0 {
			return false
		}
	}
	return true
}
