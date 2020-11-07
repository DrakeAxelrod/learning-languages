#! /usr/bin/bash

#send the stdout to 1 and stderr to 2
ls +al 1>STANDARDOUT.txt 2>STANDARDERROR.txt
ls -al 1>>STANDARDOUT.txt 2>>STANDARDERROR.txt

#one file
ls +al >combinedstdfile.txt 2>&1
# short cut
ls -al >& Shortcutwritestdoutandstderr.txt