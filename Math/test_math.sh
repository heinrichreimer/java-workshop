#!/bin/bash
echo Compiling Java source files...
javac -cp ".;junit-4.10.jar" MathTestRunner.java
echo Running tests...
java -cp ".;junit-4.10.jar" MathTestRunner
echo Tests completed
read -rsp $'Press any key to continue...\n' -n 1 key
