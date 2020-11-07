#! /usr/bin/bash

: '
example of a block comment
this is a block comment
this is a block comment
this is a block comment
this is a block comment
this is a block comment'

# comment does nothing. '#' is syntax for comments
echo "Hello Bash"

# > is to forward the command to a file example below
echo "send this to a file" > file.txt

# >> appends to a file 
echo "this is to be appended" >> append_example.txt

# this lets you actively write from terminal to file
# cat >> Writing_from_Terminal_to_File_example.txt

# Writing to the terminal example
# the kreative can be anything it is a delimiter (start and end of what you want to write)
cat << Kreative
this is hellow creative test
add another line
Kreative




