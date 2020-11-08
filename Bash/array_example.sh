#! /usr/bin/bash

car=('Toyota' 'BMW' 'Honda' 'Rover')

echo "${car[@]}"
echo "${#car[@]}"
echo "${!car[@]}"

echo "${car[0]}"
echo "${car[1]}"
echo "${car[2]}"

unset car[2]

echo "${car[@]}"
echo "${#car[@]}"
echo "${!car[@]}"

for (( i=0; i<${#car[@]}; i++ ))
do
	echo ${car[i]}
done

car[2]='Mercedes'
echo "${car[@]}"
echo "${#car[@]}"
echo "${!car[@]}"

for (( i=0; i<${#car[@]}; i++ ))
do
	echo ${car[i]}
done


