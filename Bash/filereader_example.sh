#! /usr/bin/bash

while read line
do
    echo "$line"
done < "${1:-/dev/stdin}"