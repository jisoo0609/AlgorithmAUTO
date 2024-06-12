#include <stdio.h>
#include <stdlib.h>

int isPrime(int num) {
    if (num <= 1) return 0; 
    for (int i = 2; i < num; i++) {
        if (num % i == 0) return 0;
    }
    return 1;
}

int main() {
    int n, m;
    scanf("%d", &n);
    scanf("%d", &m);

    int sum = 0;
    int firstPrime = -1;
    int foundPrime = 0;

    for (int i = n; i <= m; i++) {
        if (isPrime(i)) {
            if (!foundPrime) {
                firstPrime = i;
                foundPrime = 1;
            }
            sum += i;
        }
    }

    if (sum == 0) {
        printf("-1\n");
    } else {
        printf("%d\n", sum);
        printf("%d\n", firstPrime);
    }

    return 0;
}
