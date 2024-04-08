//Write a generic method to count the number of elements in a collection 
//that have a specific property (for example, odd integers, prime numbers, palindromes).
#include <iostream>
#include <cmath>

template <typename T>
class Count {
public:
    Count(T* t, int size) : data(t), dataSize(size) {}

    int CountPrime() {
        int count = 0;
        for (int i = 0; i < dataSize; ++i) {
            if (isPrime(data[i])) {
                count++;
            }
        }
        return count;
    }

    int CountEven() {
        int count = 0;
        for (int i = 0; i < dataSize; ++i) {
            if (data[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

private:
    T* data;
    int dataSize;

    bool isPrime(T n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= std::sqrt(n); ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
};

int main() {
    int integers[] = {1, 23, 4, 56, 78, 4, 3};
    int size = sizeof(integers) / sizeof(integers[0]);
    Count<int> counter(integers, size);
    std::cout << "The number of primes is: " << counter.CountPrime() << std::endl;
    std::cout << "The number of even numbers is: " << counter.CountEven() << std::endl;
    return 0;
}
