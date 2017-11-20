Description

In this assignment, your goal is to build a genealogy tree of Ancestors by parsing a text file.  The input text file contains a list of parent-child relationships.  The parent is the primary investigator and the child is the researcher .  Once created, the genealogy tree will be used by a main program to find the least common ancestor of two scientists.  The least common ancestor is the common ancestor of two researchers that is closest to the to two researchers.   The researcher at the root is a common ancestor to all researchers in the tree.

The genealogy tree traces the history of each academician to his/her Ph.D. advisor. It consists of professors and students with a professor as a parent node and all his/her students as its children nodes. These students (who later become professors) can it turn have their own students as their children node.

Specifications
The assignment consists of the following files (skeleton files are provided for some classes in p4.zip):

Ancestor.java - the main class that provides a user interface to the GenealogyTree .
EmptyQueueException.java - a new exception type to be thrown when queues are empty
GenealogyTree.java - a general tree class that stores (professor->student) pair relationships.
TreeNode.java - the node that the GenealogyTree must use.

LinkedList.java - class that implements the ListADT (get this from your Program 2).
LinkedListIterator.java - the iterator class that the LinkedList iterator method returns (get this from your program 2).
ListNode.java - the node type that the LinkedList must use
ListADT.java - interface that LinkedList must implement.

Queue.java - generic class that implements the generic QueueADT.  public Queue<T> implements QueueADT<T> { ... }
QueueADT.java - interface the class Queue must implement.

Stack.java - generic class that implements the generic StackADT.  public Stack<T> implements StackADT<T> { ... }
StackADT.java  - interface that class Stack must implement.
 

ListADT.java, ListNode.java and LinkedListIterator.java are the same as in Assignment 2. Be sure to fix any errors that were in your p2 implementation.  The LinkedList must use the Listnode class and the LinkedListIIterator class. 

You must define Stack, and Queue classes such that they correctly implement their respective ADTs.  The Stack and Queue classes must use an instance of the LinkedList class for their internal data structure.  Instances of the Stack and Queue classes will be used loading, traversing, and printing the tree.

The GenealogyTree class contains methods to build the genealogy tree by reading ancestor relationships from a file. All the relationships in the file are given in parent -> children format. The relationships are listed in the file in level-order.  The very first parent of the very first relationship will be the root of the genealogy tree.   Every new researcher (except the root) appearing in the file will first appear as a child of some other researcher already in the tree.

Sample input files

input1.txt  - valid input file
input_error.txt - looks okay, but it has a blank line at end, and blank lines cause file read errors
p4_input.txt - larger file of professor -> student pairs
test.txt - another sample input file to play with
make your own sample input file to tests different conditions

How to find the closest (lowest level) common ancestor
Ancestor.java contains the main method and methods to construct a GenealogyTree among other things.  It also contains the method(s) to find the closest (lowest level on tree) common ancestor of any two researchers in the tree.

Run the program with the command:  java Ancestor input.txt (where input.txt is a file with tree node relationship information)
Prompt for first researcher's name
Prompt for second researcher's name
Find ancestors of first researcher. The result should be a stack with root at bottom and researcher at top.  Tip: Do a pre-order traversal of the genealogy tree until researcher or end of tree is reached.  Return an empty tree if the researcher is not found by the time that end of the tree is reached. 
Reverse the stack so that the "root" researcher is on the top and the researcher you were asked to find is on the bottom of the stack.
Repeat steps 4 and 5 for second researcher.
Compare the researchers listed in each stack until they do not match.  Report the last common ancestor that you found.
Documentation

The javadocs for all classes provided to you is here. You are expected to complete those sections of it marked as "//TODO".

You may not add any other public methods than those listed in the provided files.

You may not modify any class in any way except where noted as "//TODO".

Steps
After you have read this program page and given thought to the problem we suggest the following steps:

If you are working with a partner, review the rules for pair programming and joining a group with your Program 4 project partner before 10 PM ON Thursday, 11/16. After this deadline you'll need to work individually.
Review the commenting and style standards that are used to evaluate your program.
You may use the Java development environment of your choice in CS 367. However, all programs must compile and run on the lab computers for grading. If you are going to use the CS lab computers, we recommend that you use Eclipse. You may want to review the Eclipse tutorial to learn the basics. Note that on the Linux lab computers, you should enter "eclipse&" at the prompt instead of what is described in the tutorial.
Download this p4.zip file to a programming assignment p4 folder that you make.  Unzip to place the following files in your p4 program folder:
Ancestor.java
EmptyQueueException.java
ListADT.java
QueueADT.java
GenealogyTree.java
Listnode.java
StackADT.java
TreeNode.java
Copy these files from your program 2 workspace
LinkedList.java
LinkedListIterator.java 
Create these classes
Stack<T> implements StackADT<T> - you must implement the StackADT given here (as it also requires a reverse method)
Queue<T> implements QueueADT<T> - you must implement the QueueADT given here
Next, complete the GenealogyTree 
tip you may wish to hard code tree nodes until you get the load from file method working as needed
Compile and run your program to ensure that it works on the Linux lab computers. You can compile your Java source using javac in a terminal window as in this example:
javac *.java
and then run your program using java as in:
java Ancestor input_file.txt
Submitting Your Work
Late work is not accepted. Don't wait.  Submit partially complete code (just make sure it compiles).
Make sure your code follows the style and commenting standards.
Make sure your program runs on the CS Linux workstations (Rm 1366 CS)
All classes must belong to the default package. (No package declaration at top of class).
Submit the following files:
Ancestor.java
LinkedList.java
Queue.java
Stack.java
GenealogyTree.java
