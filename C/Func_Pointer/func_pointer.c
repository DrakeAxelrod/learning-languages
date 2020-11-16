#include <stdio.h>

int Add(int a, int b);

int main(void)
{
    // pointer to function that should take
    //(int,int) as arguments/parameters and return int
    int c;
    int (*p)(int, int);
    p = &Add;
    c = p(2,3);
    printf("%d", c);
}

int Add(int a, int b)
{
    return a+b;
}