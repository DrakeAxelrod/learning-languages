#include <stdio.h>

int main(){

    char str[] = "Hello, World!";

    int numbers[10];

/* populate the array */
    numbers[0] = 10;
    numbers[1] = 20;
    numbers[2] = 30;
    numbers[3] = 40;
    numbers[4] = 50;
    numbers[5] = 60;
    numbers[6] = 70;

    printf("%s \n", str);
    printf("4th element in the array %d", numbers[3]);
    return 0;
}