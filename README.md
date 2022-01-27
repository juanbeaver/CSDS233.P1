# P1 Progress Log

***

## Jan. 19, 2022, 4 PM

* Created the skeletons for the NumList interface and NumArrayList class.
* Set up version control (Github repository)
* Created empty JUnit testing class

Time Spent: \~40min

## Jan. 24, 2022, 12:30 PM

* Created skeleton for JUnit testing class.
* Completed constructors for NumArrayList class.
* Created method to double the current array's capacity in case there isn't sufficient room to add.
  * This caused some issues with arrays with a length of 0 and can cause issues later with larger arrays in terms of efficiency so I will rewrite this.
* Wrote the methods that return the size and capacity of the arrays.&#x20;
* Worked on the add method but ran into issues with the helper method I mentioned above.

Time spent: \~50min

## Jan. 26, 2022, 12:40 PM

* Finished writing 50% of JUnit test cases for NumArrayList.

Time spent: \~ 30 min

## Jan. 26, 2022, 2:00 PM

* Completed the entirety of the JUnit test cases.
* Wrote the "demonstration" main method.&#x20;

Time spent: \~ 30 min &#x20;

## Jan. 27, 2022, 12:00 PM

* Fixed the add() method by making a couple of changes to my helper methods: canAdd() and increaseCapacity().
  * canAdd() was simplified to just checking if there is enough space in the array to add n amount of elements.
  * increaseCapacity() has been changed to double the capacity of the array if the current list has a size greater than 0. Else if the list has a capacity of 0, the capacity is only increased by an initial 10 spaces.
* Wrote the insert() method. Ran into issues when I forgot to increment my element counter, which caused some loops to finish too early.&#x20;
  * insert() is now passing my JUnit tests.
* Wrote the remove() method. Did not run into any major issues while implementing my idea. It is currently passing my JUnit tests.
* Wrote the contains() method with a for loop search. It passes my JUnit testing.

Time spent: \~1 hour (50% - 70% mark)

## Jan. 27, 2022, 2:00 PM

### Goals:

* FInish lookup(), equals() for 90%
* finish removeDuplicates() and write main method demonstration for 100%/Final
  * The main method in the last progress update was not 100% finished.
* Add comments where needed.

### Progress:

* Finished the lookup() method by using a try catch block. Returning list\[i] and throwing a ArrayOutOfBoundsException.
  * I had a little bit of trouble writing the test case for making sure that the exception was being raised but eventually found assertThrows().
* Finished the equals() method. I identified two lists equal to each other if they had the same sequence of numbers and the same amount of elements, capacities were not considered.

Time spent: \~30 min (90% completed)

* Finished the removeDuplicates() method. I had a lot of issues with ArrayOutOfBoundsException, but I was able to track it down to a for loop that had a condition that was decreasing as the for loop when on, causing it to end just short of the proper answer.
* Finished the main method demonstration.&#x20;

Time spent: \~30 min (100% completed).
