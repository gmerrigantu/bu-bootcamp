#include <stdio.h>

void swap(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

void broken_swap(int a, int b) {
    int temp = a;
    a = b;
    b = temp;
}

int main() {
    int x = 10, y = 20;

    printf("Before swap: x = %d, y = %d\n", x, y);
    swap(&x, &y);
    printf("After swap:  x = %d, y = %d\n", x, y);

    int m = 5, n = 15;
    printf("\nBefore broken_swap: m = %d, n = %d\n", m, n);
    broken_swap(m, n);
    // m and n are unchanged here because broken_swap receives copies of
    // the values, not the addresses of m and n, so it swaps its own
    // local copies and the originals are never touched.
    printf("After broken_swap:  m = %d, n = %d\n", m, n);

    return 0;
}
