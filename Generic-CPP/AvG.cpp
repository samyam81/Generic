#include <iostream>
#include <type_traits>

using namespace std;

template<typename T>
class AvG {
public:
    AvG(T* t, int size) {
        double sum = 0.0; // Initialize sum as a double
        for (int i = 0; i < size; ++i) {
            sum += static_cast<double>(t[i]); // Convert each element to double and add to sum
        }
        double average = sum / size; // Calculate average
        cout << "The Average: " << average << endl;
    }
};

int main() {
    int integer[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    AvG<int> avg_int(integer, sizeof(integer) / sizeof(integer[0]));

    double double1[] = {2.2, 3.3, 4.4, 5.5, 6.6};
    AvG<double> avg_double(double1, sizeof(double1) / sizeof(double1[0]));

    return 0;
}
