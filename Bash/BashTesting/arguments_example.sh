#! /usr/bin/bash

# creates an array of unlimited amount of arguments and puts it in an array
args=("$@")

for (( i=0; i<$#; i++))
do
    echo ${args[i]}
done