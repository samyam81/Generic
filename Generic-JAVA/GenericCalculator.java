public class GenericCalculator<T> {
    public static void main(String[] args) {
        GenericCalculator<Double> calculator = new GenericCalculator<>();
        calculator.calculate(10.0, 2.0, new Addition());
        calculator.calculate(10.0, 2.0, new Subtraction());
        calculator.calculate(10.0, 2.0, new Multiplication());
        calculator.calculate(10.0, 2.0, new Division());
    }

    void calculate(T x, T y, MathOperation<T> mathOperation) {
        T result = mathOperation.perform(x, y);
        System.out.println("Result: " + result);
    }

    interface MathOperation<T> {
        T perform(T a, T b);
    }

    static class Addition implements MathOperation<Double> {
        @Override
        public Double perform(Double a, Double b) {
            return a + b;
        }
    }

    static class Subtraction implements MathOperation<Double> {
        @Override
        public Double perform(Double a, Double b) {
            return a - b;
        }
    }

    static class Multiplication implements MathOperation<Double> {
        @Override
        public Double perform(Double a, Double b) {
            return a * b;
        }
    }

    static class Division implements MathOperation<Double> {
        @Override
        public Double perform(Double a, Double b) {
            if (b == 0.0) {
                throw new IllegalArgumentException("Division by zero is not allowed");
            }
            return a / b;
        }
    }
}
