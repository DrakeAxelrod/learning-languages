#include <stdio.h>

int main() 
{
  int n = 10;
  int *pointer_to_n = &n;

  /* your code goes here */

  /* testing code */
  if (pointer_to_n != &n) return 1;
  if (*pointer_to_n != 11) return 1;

  printf("Done!\n");
  return 0;
}