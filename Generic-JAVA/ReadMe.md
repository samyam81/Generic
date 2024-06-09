# Generic Programming : JAVA

Generic-JAVA is a repository housing Java codebase showcasing the principles and implementations of generic programming in Java.

## Prerequisites

To run or contribute to the code in this repository, you should have:

- Basic knowledge of JAVA programming language.
- Understanding of basic data structures such as arrays, linked lists, and dictionaries.
- Familiarity with Generic Programming.

## Contents

1. **AvG.java**:
   This Java code defines a generic class `AvG` that calculates the average of elements in an array of numbers. The class takes an array of type `T`, where `T` extends the `Number` class, ensuring that only numeric types can be used. In the constructor, it iterates over the array, converting each element to a `double` and summing them up. Finally, it calculates the average by dividing the sum by the length of the array and prints it out. The `main` method demonstrates the usage of this class with arrays of integers and doubles.

2. **Count.java**:
   This Java code defines a generic class `Count` that calculates the number of prime numbers and even integers in an array. The constructor of `Count` takes an array of type `T`, where `T` is a generic type. It then calls the `CountPrime` and `CountEven` methods to count the prime numbers and even integers in the array, respectively. The `isPrime` method checks whether a given integer is prime, and the `CountEven` method counts the number of even integers in the array. Finally, in the `main` method, an array of integers is created and passed to an instance of the `Count` class to demonstrate its usage.

3. **GenericCalculator.java**:
   This Java code defines a generic calculator (`GenericCalculator`) capable of performing arithmetic operations on double values. It utilizes a generic method `calculate` that takes two operands `x` and `y` of type `T` and an instance of `MathOperation<T>` interface to perform the operation. The `MathOperation` interface defines a method `perform` which accepts two operands and returns a result of type `T`. 

   Four concrete implementations of the `MathOperation` interface are provided: `Addition`, `Subtraction`, `Multiplication`, and `Division`, each performing their respective arithmetic operations on double values. In the `main` method, the `calculate` method is called with different `MathOperation` instances to demonstrate addition, subtraction, multiplication, and division.

4. **GenericSTACK.java**:
   This Java code defines a generic stack class `GenericSTACK` using the `Stack` class from `java.util`. It provides methods to push elements onto the stack (`push`) and pop elements from the stack (`pop`). In the `main` method, an instance of `GenericSTACK` is created, elements of different types (integer, double, and string) are pushed onto the stack, and then popped and printed in reverse order. However, there's a discrepancy in the comments regarding the expected output of popping the elements: the first comment indicates it will print "String", the second indicates it will print "2.2", and the third indicates it will print "2".

5. **HashMopp.java**:
   This Java code defines a generic hashmap implementation (`HashMopp`) along with an inner class `InnerHashMopp` which extends it. 

   `HashMopp` consists of a key-value pair, while `InnerHashMopp` represents the hashmap itself. It utilizes an array of array lists (`buckets`) to store the key-value pairs, implementing basic hashmap functionalities such as `put`, `get`, and `remove`. 

   It also includes a resizing mechanism to maintain efficiency, and methods to retrieve the size and check if the hashmap is empty.

   This implementation demonstrates the fundamental concepts of a hashmap data structure, handling collisions using separate chaining, and dynamic resizing for efficiency.

6. **Max.java**:
   This Java code defines a generic class `Max` that finds the maximum element in an array of comparable elements. In the constructor, it sorts the array in ascending order using `Arrays.sort()` and then prints the last element, which is the largest.

   In the `main` method, instances of `Max` are created with arrays of integers and doubles, demonstrating its usage. When instantiated, each instance finds and prints the largest element in its respective array.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or create a pull request.
