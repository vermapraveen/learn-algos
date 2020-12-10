#include "array_learn.h"
#include <stdio.h>

void addAsLastElement(int *arr1, int size_of_arr1, int *arr2, int el)
{
    for (int i = 0; i < size_of_arr1; i++)
    {
        arr2[i] = arr1[i];
    }

    arr2[size_of_arr1] = el;
}

int* addAsLastElement2(int *original_arr, int size_of_orig_arr, int el_to_add)
{
    int new_arr_size = size_of_orig_arr + 1;

    int new_arr[new_arr_size];
    for (int i = 0; i < new_arr_size; i++)
    {
        new_arr[i] = original_arr[i];
    }

    new_arr[size_of_orig_arr] = el_to_add;


    original_arr = new_arr;

    return original_arr;
}