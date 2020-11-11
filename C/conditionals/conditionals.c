#include <stdio.h>


// In this exercise, you must construct an if statement inside the guessNumber function
// statement that checks if the number guess is equal to 555.
// If that is the case, the function must print out using printf "Correct. You guessed it!". 
// If guess is less than 555, the function must print out using printf "Your guess is too low." 
// If guess is greater than 555, the function must print out using printf "Your guess is too high."

void guessNumber(int guess) 
{
    if (guess > 555)
    {
        printf("Your guess is too high.\n");
    } 
    else if (guess < 555)
    {
        printf("Your guess is too low.\n");
    }
    else
    {
        printf("Correct. you guessed it!\n");
    }
}

int main() {
    guessNumber(500);
    guessNumber(600);
    guessNumber(555);
}