@echo Compiling Java source files...
@javac -cp ".;junit-4.10.jar" ArraySortTestRunner.java
@echo Running tests...
@java -cp ".;junit-4.10.jar" ArraySortTestRunner
@echo Tests completed
@pause