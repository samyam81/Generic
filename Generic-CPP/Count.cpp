#include <iostream>
#include <cmath>

using namespace std;

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
        for (int i = 2; i <= sqrt(n); ++i) {
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
    cout << "The number of primes is: " << counter.CountPrime() << endl;
    cout << "The number of even numbers is: " << counter.CountEven() << endl;
    return 0;
}
