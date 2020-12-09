#include "array_learn.h"
#include <stdio.h>

void init_array(int *arr, int size)
{
    for (int i = 0; i < size; ++i)
    {
        arr[i] = -1;
    }
}
