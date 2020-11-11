#include <stdio.h>

int main( void )
{
    int a;

    int *ptr;

    printf("%p\n",&a);
    a = 10;
    ptr = &a;
    printf("%p\n", &ptr);
    printf("%p\n", ptr);
    printf("%d\n",*ptr);


}