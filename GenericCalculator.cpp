#include <iostream>
#include <stdexcept>

template<typename T>
class GenericCalculator {
public:
    void calculate(T x, T y, MathOperation<T>& mathOperation) {
        T result = mathOperation.perform(x, y);
        std::cout << "Result: " << result << std::endl;
    }

    class MathOperation {
    public:
        virtual T perform(T a, T b) = 0;
        virtual ~MathOperation() {}
    };

    class Addition : public MathOperation {
    public:
        T perform(T a, T b) override {
            return a + b;
        }
    };

    class Subtraction : public MathOperation {
    public:
        T perform(T a, T b) override {
            return a - b;
        }
    };

    class Multiplication : public MathOperation {
    public:
        T perform(T a, T b) override {
            return a * b;
        }
    };

    class Division : public MathOperation {
    public:
        T perform(T a, T b) override {
            if (b == 0) {
                throw std::invalid_argument("Division by zero is not allowed");
            }
            return a / b;
        }
    };
};

int main() {
    GenericCalculator<double> calculator;
    calculator.calculate(10.0, 2.0, calculator.Addition());
    calculator.calculate(10.0, 2.0, calculator.Subtraction());
    calculator.calculate(10.0, 2.0, calculator.Multiplication());
    calculator.calculate(10.0, 2.0, calculator.Division());

    return 0;
}
