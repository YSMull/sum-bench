#include <iostream>

int main() {
    auto start = std::chrono::steady_clock::now();
    long s = 0;
    for (int i = 1; i < 10000001; i++) {
        s += i;
    }
    auto end = std::chrono::steady_clock::now();
    std::cout << "Elapsed time in milliseconds: "
         << std::chrono::duration_cast<std::chrono::milliseconds>(end - start).count()
         << " ms" << std::endl;
    return 0;
}
