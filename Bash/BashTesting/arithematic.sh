#! /usr/bin/bash

#example one
n1=21
n2=43
echo $(( n1 + n2))
echo $(( n1 * n2))
echo $(( n1 - n2))
echo $(( n1 / n2))
echo $(( n1 % n2))

#example two
echo $(expr $n1 + $n2)
echo $(expr $n1 \* $n2)
echo $(expr $n1 - $n2)
echo $(expr $n1 / $n2)
echo $(expr $n1 % $n2)

#hex number to decimal number
echo "Enter hex number of your choice"
read Hex

echo -n "The decimal value of $Hex is: "
echo "obase=10; ibase=16; $Hex" | bc
