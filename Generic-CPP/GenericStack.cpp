#include <iostream>
#include <stack>
#include <string>
#include <stdexcept>

using namespace std; 

template<typename T>
class GenericStack {
private:
    stack<T> stack; 
public:
    // Constructor
    GenericStack() {}

    // Method to push elements onto the stack
    void push(T t) {
        stack.push(t);
    }

    // Method to pop elements from the stack
    T pop() {
        if (stack.empty()) {
            throw runtime_error("Stack is empty"); /
        }
        T top = stack.top();
        stack.pop();
        return top;
    }
};

int main() {
    // Create an instance of GenericStack
    GenericStack<int> stack; 
  
    stack.push(2);
    stack.push(2);
    stack.push(3);

    // Pop and print elements from the stack
    cout << stack.pop() << endl; // This will print 3
    cout << stack.pop() << endl; // This will print 2
    cout << stack.pop() << endl; // This will print 2

    return 0;
}
