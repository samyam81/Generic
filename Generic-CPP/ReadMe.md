# Generic Programming : C++

Generic-CPP is a repository housing C++ codebase showcasing the principles and implementations of generic programming in C++.

## Prerequisites

To run or contribute to the code in this repository, you should have:

- Basic knowledge of C++ programming language.
- Understanding of basic data structures such as arrays, linked lists, and dictionaries.
- Familiarity with Generic Programming.

## Contents

1. **AvG.cpp**:
    This C++ code defines a template class `AvG` that calculates the average of elements in an array of any numeric type. In the constructor of `AvG`, it takes a pointer to an array (`t`) and the size of the array (`size`). It then iterates through the array, converting each element to a `double` using `static_cast<double>`, and adds it to the sum. After calculating the sum, it computes the average by dividing the sum by the size of the array. In the `main` function, instances of `AvG` are created with arrays of integers and doubles. Each instance calculates the average of its respective array and prints it out. The code utilizes template metaprogramming to enable generic programming, allowing the `AvG` class to work with different numeric types. It also utilizes `static_cast` to ensure proper conversion of elements to `double` for summation.

2. **Count.cpp**:
    This C++ code defines a template class `Count` that counts the number of prime numbers and even integers in an array. It utilizes template metaprogramming to work with arrays of any numeric type. The `main` function demonstrates its usage by creating an instance of `Count` with an array of integers and printing the counts of primes and even numbers.

3. **GenericCalculator.cpp**:
    This C++ code defines a generic calculator class (`GenericCalculator`) capable of performing arithmetic operations on numeric types. It utilizes template metaprogramming to enable flexibility with numeric types. The calculator's methods accept two operands and a math operation instance. The `MathOperation` class defines a virtual method `perform` for arithmetic operations. Concrete implementations such as `Addition`, `Subtraction`, `Multiplication`, and `Division` are provided. In the `main` function, an instance of `GenericCalculator` is created for double values, and arithmetic operations are performed using the calculator's methods. If division by zero is attempted, an exception is thrown.

4. **GenericStack.cpp**:
    This C++ code defines a template class `GenericStack` that implements a stack data structure using the standard library `stack`. It includes methods `push` to add elements onto the stack and `pop` to remove and return the top element. In the `main` function, an instance of `GenericStack` is created for integer values. Integers are pushed onto the stack, and then popped and printed in reverse order. If the `pop` method is called on an empty stack, a `runtime_error` is thrown with the message "Stack is empty".

5. **Max.cpp**:
    This C++ code defines a template class `Max` that finds the maximum element in an array of any comparable type. In the constructor of `Max`, it takes a pointer to an array (`t`) and the size of the array (`size`). It then sorts the array in ascending order using the `sort` function from the `<algorithm>` library and prints the last element, which is the largest. In the `main` function, instances of `Max` are created with arrays of integers and doubles. Each instance calculates the largest element in its respective array and prints it out. This code demonstrates the use of template metaprogramming to enable generic programming in C++, allowing the `Max` class to work with arrays of different types.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or create a pull request.
