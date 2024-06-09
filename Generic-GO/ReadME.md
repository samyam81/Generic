# Generic Programming : GO

Generic-GO is a repository housing Go codebase showcasing the principles and implementations of generic programming in Go.

## Prerequisites

To run or contribute to the code in this repository, you should have:

- Basic knowledge of Go programming language.
- Understanding of basic data structures such as arrays, linked lists, and dictionaries.
- Familiarity with Generic Programming.

## Contents

1. **AvG.go**:
   This Go code defines a generic type `AvG[T any]` representing a structure to calculate the average of elements in an array. Two functions, `NewAvGInt` and `NewAvGFloat`, are defined to create instances of `AvG` for integer and float arrays, respectively. 

   Inside these functions, the average is calculated by summing up the elements of the array and dividing by the array's length. The result is printed to the console. 

   In the `main` function, instances of `AvG` are created for integer and float arrays using the respective `NewAvG` functions, passing sample arrays as arguments.

   This approach demonstrates Go's flexibility in implementing generics, allowing the creation of generic types and functions capable of handling different data types transparently. 

   The use of the `any` constraint in the `AvG` type declaration ensures that it can work with any data type.

2. **Count.go**:
   This Go code defines a set of functions to count the number of even integers and prime numbers in an array of integers. The `main` function creates an integer array and calls the `count` function, passing the array as an argument.

   The `count` function internally calls two functions: `CountEven` and `CountPrime`, passing the integer array to each of them. 

   The `CountEven` function iterates through the array, incrementing a counter for each even number encountered. It then prints out the total count of even numbers.

   Similarly, the `CountPrime` function iterates through the array, checking each element for primality using the `IsPrime` function. It increments a counter for each prime number encountered and prints out the total count of prime numbers.

   The `IsPrime` function checks whether a given integer is prime by iterating from 2 to half of the integer and checking for divisibility.

3. **Max.go**:
   This Go code defines a generic `Max` struct that finds the maximum element in an array of any comparable type. The `Max` struct is parameterized by a type `T` that must satisfy the `Comparable` interface, which includes a method `LessThan` for comparing two elements of type `T`. 

   The `NewMax` function initializes a `Max` struct with the given array.

   The `FindMax` method sorts the array using the `LessThan` method for comparison and returns the last element, which is the maximum.

   Two concrete types `Int` and `Float64` are defined to satisfy the `Comparable` interface. Each type implements the `LessThan` method for comparison.

   In the `main` function, instances of `Max` are created with arrays of `Int` and `Float64`. The `FindMax` method is called on each instance, and the maximum element is printed out.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or create a pull request.
