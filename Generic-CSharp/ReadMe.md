# Generic Programming : C#

Generic-CSharp is a repository housing C# codebase showcasing the principles and implementations of generic programming in C#.

## Prerequisites

To run or contribute to the code in this repository, you should have:

- Basic knowledge of C# programming language.
- Understanding of basic data structures such as arrays, linked lists, and dictionaries.
- Familiarity with Generic Programming.

## Contents

1. **AvG.cs**:
   This C# code defines a generic class `AvG<T>` that calculates the average of elements in an array of any numeric type. The constructor takes an array of type `T`, iterates through it, converting each element to a `double` using `Convert.ToDouble()`, and sums them up. It then calculates the average and prints it out. In the `Main` method, instances of `AvG` are created with arrays of integers and doubles, demonstrating its usage with different numeric types.

2. **Count.cs**:
   This C# code defines a generic class `Count<T>` that counts the number of elements in an array satisfying a given condition. The class contains a constructor that takes an array of type `T` and a method `CountSatisfying` that accepts a predicate function. Inside `CountSatisfying`, it iterates through the array and increments a counter for each element that satisfies the predicate.

   In the `Program` class, there's a static method `IsPrime` that checks if a given integer is prime. In the `Main` method, an instance of `Count<int>` is created with an array of integers. The `CountSatisfying` method is then called twice, once with the `IsPrime` method as the predicate to count prime numbers, and once with a lambda expression to count even numbers. Finally, the counts are printed out.

3. **GenericCalculator.cs**:
   This C# code defines a generic calculator class `GenericCalculator<T>` capable of performing arithmetic operations on generic types. It contains an interface `IMathOperation<T>` with a method `Perform` to perform arithmetic operations. Concrete implementations of addition, subtraction, multiplication, and division are provided as nested classes within `GenericCalculator<T>`. These implementations use the `dynamic` keyword to handle arithmetic operations on generic types.

   In the `Main` method of the `Program` class, an instance of `GenericCalculator<double>` is created, and arithmetic operations are performed using different implementations of `IMathOperation<T>`. If division by zero is attempted, an `ArgumentException` is thrown. Finally, the results are printed out.

4. **GenericStack.cs**:
   This C# code defines a generic stack class `GenericStack<T>` using the `Stack<T>` class from the `System.Collections.Generic` namespace. It provides methods `Push` to add elements onto the stack and `Pop` to remove and return the top element.

   In the `Main` method, an instance of `GenericStack<object>` is created, allowing elements of any type to be pushed onto the stack. Integer, double, and string values are pushed onto the stack, demonstrating the flexibility of the generic stack. The elements are then popped and printed in reverse order, with appropriate casting to their original types.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or create a pull request.
