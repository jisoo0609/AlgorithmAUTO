#include <stdio.h>
#include <stdlib.h>

int compare(const void *a, const void *b) {
    return (*(int*)a - *(int*)b);
}

int main() {
    int n;
    
    // 표준 입력으로부터 정수 n을 읽음
    scanf("%d", &n);

    int *list = (int*)malloc(n * sizeof(int));
    if (list == NULL) {
        fprintf(stderr, "메모리 할당 실패\n");
        return 1;
    }

    for (int i = 0; i < n; i++) {
        scanf("%d", &list[i]);
    }

    qsort(list, n, sizeof(int), compare);

    for (int i = 0; i < n; i++) {
        printf("%d\n", list[i]);
    }

    free(list);

    return 0;
}
