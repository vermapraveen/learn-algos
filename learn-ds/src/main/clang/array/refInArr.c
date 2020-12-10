#include <stdio.h>

void print_arr(int *arr, int size_of_arr)
{
    for (int i = 0; i < size_of_arr; i++)
    {
        printf("%d\t", arr[i]);
    }
    printf("\n");
}

void print_arr2(int *arr[], int size_of_arr)
{
    for (int i = 0; i < size_of_arr; i++)
    {
        printf("%d\t", *arr[i]);
    }
    printf("\n");
}

int main(int argc, char const *argv[])
{
    int size_of_arr = 5;
    printf("address of size_of_arr : %p", &size_of_arr);
    printf("\n");

    int arr[] = {1, 2, 3, 4, 5};
    int *ptrToFirstElementOfArr = arr;

    int(*ptrToWholeArr)[size_of_arr];
    ptrToWholeArr = &arr;

    printf("address of arr : %p", &arr);
    printf("\n");
    printf("address of ptrToFirstElementOfArr : %p", ptrToFirstElementOfArr);
    printf("\n");
    printf("address of ptrToWholeArr : %p", ptrToWholeArr);
    printf("\n");

    for (int i = 0; i < size_of_arr; i++)
    {
        printf("address of element #%d in arr: %p", i, &arr[i]);
        printf("\n");
    }

    print_arr(arr, size_of_arr);
    print_arr(ptrToFirstElementOfArr, size_of_arr);
    // print_arr2(ptrToWholeArr, size_of_arr);

    printf("\n");
    return 0;
}
