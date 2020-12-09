#include "array_learn.h"
#include <stdio.h>

void print_arr1(int *arr, int size_of_arr)
{
    for (int i = 0; i < size_of_arr; i++)
    {
        printf("%d\t", arr[i]);
    }
    printf("\n");
}

int main(int argc, char const *argv[])
{
    int size_of_arr = 10;
    int arr[size_of_arr];
    init_array(arr, size_of_arr);
    print_arr1(arr, size_of_arr);

    int arr2[size_of_arr + 1];
    addAsLastElement(arr, size_of_arr, arr2, 5);
    size_of_arr++;
    print_arr1(arr2, size_of_arr);

    int *arr3 = addAsLastElement2(arr2, size_of_arr, 15);
    size_of_arr++;
    print_arr1(arr3, size_of_arr);

    return 0;
}
