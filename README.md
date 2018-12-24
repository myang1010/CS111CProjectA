# CS111CProjectA
Generics
Use generics to create a Java class called Trio that represents a group of three items.

A trio has the following characteristics:

Trios hold three items of the same type.
For example, a Trio can hold three Integers or it could hold three Strings or it could hold three Students, etc. A Trio could not, however, hold two Integers and a String.
A Trio can contain duplicates.
A Trio's items are unordered.
The order doesn't matter. (This is like a set in mathematics. A Trio is not the same as a set, however, because a Trio can contain duplicates.)
For example, the Trio (3, 4, 5) is considered the same as the Trio (4, 5, 3) and the Trio ("hi", "bye", "hello") is considered the same as the Trio ("hello", "hi", "bye").
Requirements

Here is the class header. This header states that the Trio class holds items that implement Comparable and that Trios themselves are also Comparable.

public class Trio<T extends Comparable<? super T>> implements Comparable<Trio <T>>
Your class must compile and have the following:

(10 points) instance data for the three items contained in the Trio
(10 points) two constructors:
one constructor takes in the three items as parameters
a second constructor takes in a single item and the Trio will then consist of three of these items
(5 points) getters and setters for each item in the trio
(5 points) a toString method that returns a text representation of the trio 
(15 points) a method called contains that returns a count of how many times an item is in the Trio
(15 points) a method called hasDuplicates that returns true if the at least two items within the Trio are the same as each other.
Note this does not determine duplicates based on whether any of the items are aliases, but whether any of the items are equal- logically equivalent to each other.
(20 points) an equals method that overrides the equals method of the Object class.
The method returns true if the current Trio holds the same three items in any order as the Trio sent as a parameter and false otherwise.
The equals method should not alter either the parameter or the current Trio object.
(20 points) a compareTo method that defines a natural ordering for Trio objects
The method header is: public int compareTo(Trio<T> otherTrio)
Order Trio objects by the smallest item in each Trio. 
If the minimum of the current Trio is less than the minimum of the Trio sent in as a parameter, the current Trio is smaller. 
If the minimum of the current Trio is greater than the minimum of the Trio sent in as a parameter, the current Trio is larger. 
If the minimums of the two Trios are equal, the compareTo method will evaluate the Trios are equal.
Hint: make a private helper method to find the smallest item in any Trio.
Note that because of the class header, you can invoke compareTo on any element in the Trio.
The compareTo method should not alter either the parameter or the current Trio object.
Notes

Below is a driver program you can use to test your Trio class.
You might choose to add additional code and test cases.
TrioTester.javaPreview the document

Make sure that your code compiles. Code that does not compile will receive a score of zero.
Compiler warnings are okay- just not compiler errors.
Submission

Remove any package statements so that Trio is not in a named package. Upload Trio.java.

If submitting as a group, submit one assignment only through one group member's account. Put the names of all group members in the comment submission box on Canvas.

Note that I extended the deadline to Tuesday because of the Labor Day holiday. However, I strongly recommend you submit by Monday because Module 3 will begin on Tuesday and a new homework will open then!
