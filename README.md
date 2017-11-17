
Running unit tests
==============================
Grading LinkedList.java
------------------------------
Files compiled successfully as part of the full program

JUnit version 4.12
.....LinkedListTest(test_addAtPos_get) - unexpected exception occured
java.lang.NullPointerException
...
------------------------------
Points for LinkedList: 17 / 20
------------------------------

Time: 0.013

OK (8 tests)

==============================

==============================
Grading LinkedListIterator.java
------------------------------
Files compiled successfully as part of the full program

JUnit version 4.12
..
------------------------------
Points for GroceryList: 5 / 5
------------------------------

Time: 0.008

OK (2 tests)

==============================

==============================
Grading Train.java
------------------------------
Files compiled successfully as part of the full program

JUnit version 4.12
...TrainTest(test_add_getHeaderNode) - new train's headerNode is null or has next data node
.TrainTest(test_add_getWeight) - train weight not matched. (expected:4/actual:1)
..TrainTest(test_addAtPos_iterator) - unexpected exception occured
java.lang.NullPointerException

------------------------------
Points for Train: 11 / 20
------------------------------

Time: 0.013

OK (6 tests)

==============================

==============================
Grading TrainGenerator.java
------------------------------
Files compiled successfully as part of the full program

JUnit version 4.12
...TrainGeneratorTest(test_getIncomingTrainFromFile_with_err_lines) - exception occured when create train from file with error lines
java.lang.NumberFormatException: For input string: "    1000"
.
------------------------------
Points for TrainGenerator: 7 / 10
------------------------------

Time: 0.014

OK (4 tests)

Program compiled successfully as part of end-to-end test
Points for ProgramCompilation: 5 / 5

----------------------------------------------
Running end-to-end test for sample eteRun0
testing command 4; removing trains from b/w,start,end.

diff results
run diff: 30
Test failed; 30 differences found in output0.txt
Points for eteRun0: 0 / 3

----------------------------------------------
Running end-to-end test for sample eteRun1
testing command 4; removing from b/w,start,end/. Till all the trains are removed from the hub.

diff results
run diff: 37
Test failed; 37 differences found in output1.txt
Points for eteRun1: 0 / 2

----------------------------------------------
Running end-to-end test for sample eteRun2
testing command 2: removing all the cargos from train one by one.

diff results
run diff: 28
Test failed; 28 differences found in output2.txt
Points for eteRun2: 0 / 5

----------------------------------------------
Running end-to-end test for sample eteRun3
testing reading multiple files; Testing command 3, getWeight method.

diff results
run diff: 22
Test failed; 22 differences found in output3.txt
Points for eteRun3: 0 / 5

----------------------------------------------
Running end-to-end test for sample eteRun4
testing command 6 and 5 (display one train and depart all trains)

diff results
run diff: 24
Test failed; 24 differences found in output4.txt
Points for eteRun4: 0 / 5

----------------------------------------------
Running end-to-end test for sample eteRun5
testing all commands; simple cases.
Timed out while processing eteRun5
output5.txt empty
Points for eteRun5: 0 / 10

----------------------------------------------
Running end-to-end test for sample eteRun6
testing reading of bad file
Could not execute the java program.
Points for eteRun6: 0 / 2

----------------------------------------------
Running end-to-end test for sample eteRun7
testing reading of bad file
Could not execute the java program.
Points for eteRun7: 0 / 1

----------------------------------------------
Running end-to-end test for sample eteRun8
testing reading and handling of large file
Timed out while processing eteRun8
output8.txt empty
Points for eteRun8: 0 / 3

----------------------------------------------
Running end-to-end test for sample eteRun9
testing case insensitivity and wrong commands
Timed out while processing eteRun9
output9.txt empty
Points for eteRun9: 0 / 4

----------------------------------------------
==============================================
Move Multiple Cargo Cars Tests
----------------------------------------------
Running end-to-end test for sample eteRun10
testing command 8 (move multiple cargos,simple case)

diff results
run diff: 16
Test failed; 16 differences found in output10.txt
Points: 0 / 5

Running end-to-end test for sample eteRun11
testing command 8 (move multiple cargos,different cases)
Could not execute the java program.
Points: 0 / 5

----------------------------------------------
==============================================
Move Multiple Cargo Cars Tests: 0 / 10
Total: 45 / 100





