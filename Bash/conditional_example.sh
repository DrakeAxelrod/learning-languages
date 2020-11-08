#! /usr/bin/bash

count=10

# -eq stands for equal -ne stand for not equal
# -gt stands for greater than 
# if you want to use > you need to replace [] with (( expression > expression))
if [ $count -eq 10 ]
then 
    echo "the conditional statement is true"
# for else if syntax is 'elif' also an example of not using []
elif (($count <= 9))
then
    echo "this variable is less than or equal to 9"
else
    echo "the conditional statement is false"
fi