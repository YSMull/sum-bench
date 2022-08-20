#include <iostream>

long perform(int n) {
    long s = 0;
    for (int i = 1; i < n; i++) {
        s += i;
    }
    return s;
}

int main() {
    char input[] = "10000001\n10000001\n10000001\n10000001\n10000001\n10000001\n10000001\n";
    auto n = strtok(input, "\n");
    while (n != nullptr) {
        auto start = std::chrono::steady_clock::now();
        long result = perform(atoi(n));
        auto end = std::chrono::steady_clock::now();
        std::cout << "result: "
                  << result
                  << "\nElapsed time in milliseconds: "
                  << std::chrono::duration_cast<std::chrono::nanoseconds>(end - start).count()
                  << " ns" << std::endl;
        n = strtok(nullptr, "\n");
    }
    return 0;
}
