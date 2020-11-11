#include <stdio.h>

int main(void)
{
    for (int i = 0; i < 10; i++) 
    {
    printf("%d\n", i);
    }

    int array[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int sum = 0;

    for (int i = 0; i < 10; i++) 
    {
    sum += array[i];
    }

    /* sum now contains a[0] + a[1] + ... + a[9] */
    printf("Sum of the array is %d\n", sum);

      int array_2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int factorial = 1;
    int i;

    /* calculate the factorial using a for loop  here*/
        for (int i = 0; i < 10; i++) 
    {
    factorial *= array[i];
    }

    printf("10! is %d.\n", factorial);
}