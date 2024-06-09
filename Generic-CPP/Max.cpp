#include <iostream>
#include <algorithm>

using namespace std;

template<typename T>
class Max {
public:
    Max(T* t, int size) {
        sort(t, t + size);
        cout << "The largest of type is: " << t[size - 1] << endl;
    }
};

int main() {
    int integers[] = {1, 2, 3, 45, 65, 97};
    Max<int> max_int(integers, sizeof(integers) / sizeof(integers[0]));

    double doubles[] = {999.0, 9862.0, 667.2, 97.85};
    Max<double> max_double(doubles, sizeof(doubles) / sizeof(doubles[0]));

    return 0;
}
