#! /usr/bin/bash

# while loop. -le less then or equal
echo "----while loop----"
number=1
while [ $number -le 10 ]
do
    echo "$number"
    number=$(( $number+1 ))
done

# runs until false. -ge greater than or equal
echo "----until loop----"
number=1
until [ $number -ge 10 ]
do
    echo "$number"
    number=$(( $number+1 ))
done

# for loop.
echo "----for loop----"
# {start..ending..increment}
#for i in {0..20..2}
# different syntax
for (( i=0; i<5; i++ ))
do 
    echo "$i"
done

# break
echo "----break----"
for (( i=0; i<=10; i++ ))
do 
    if [ $i -gt 5 ]
    then
        break
    fi
    echo "$i"
done

#continue
echo "----continue----"
for (( i=0; i<=10; i++ ))
do 
    if [ $i -eq 3 ] || [ $i -eq 7 ]
    then
        continue
    fi
    echo "$i"
done