#! /usr/bin/bash

echo "enter first string"
read str1

echo "enter second string"
read str2

if [ "$str1" == "$str2" ]
then
    echo "strings match"
else
    echo "strings don't match"
fi

# to lower case ^ eith capital first letter. to upper case ^^
echo ${str1^}
echo ${str2^^}