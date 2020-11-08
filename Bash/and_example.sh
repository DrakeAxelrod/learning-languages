#! /usr/bin/bash

age=10

# && is the and operator
# you can also write as
if (("$age > 10")) && (("$age < 40"))
# if [ "$age -gt 18" ] && [ "$age" -lt 40 ]
then
    echo "age is correct"
else
    echo "age is not correct"
fi