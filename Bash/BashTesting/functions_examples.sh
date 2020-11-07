#! /usr/bin/bash

function nameOfFunction()
{
    echo "this is new function"
}

function functionPrint()
{
    echo $1 $2 $3 $4
}

function functionCheck()
{
    returnValue="Using function right now"
    echo $returnValue
}

# functionPrint Hi this is Drake
functionCheck
