import org.junit.Assert;
import org.junit.Test;

import org.junit.Assert.*;

import static org.junit.Assert.*;

/**
 * The test class numArrayListTest.
 *
 * @author  (Juan Beaver)
 * @version (01/26/22)
 */
public class NumArrayListTest
{
    /**
     * Default constructor for test class numArrayListTest
     */
    
    @Test
    public void testSizeAndCapacity(){
        NumArrayList testList = new NumArrayList(5);
        testList.add(1);
        testList.add(2);
        assertEquals(2, testList.size());
        
        NumArrayList testList2 = new NumArrayList(0);
        assertEquals(0,testList2.size());
        
        NumArrayList testList3 = new NumArrayList(1);
        assertEquals(1, testList3.size());
        
        NumArrayList testList4 = new NumArrayList();
        assertEquals(0,testList4.size());
    }
    
    @Test
    public void testAddAndToString(){
        NumArrayList testList = new NumArrayList(5);
        testList.add(1);    testList.add(2);    testList.add(3);    testList.add(4);    testList.add(5);
        assertEquals("1.0 2.0 3.0 4.0 5.0", testList.toString());

        //test adding to a list with insufficient capacity for the operation
        NumArrayList testList2 = new NumArrayList(1);
        testList2.add(1);
        //This next line should automatically increase the capacity of the list.
        testList2.add(2);
        assertEquals("1.0 2.0", testList2.toString());

        //Test adding to a list that was initiated with a capacity of zero
        NumArrayList testList3 = new NumArrayList();
        testList3.add(1);   testList3.add(2);   testList3.add(3);

        assertEquals("1.0 2.0 3.0", testList3.toString());
    }

    @Test
    public void testInsert(){
        //Test inserting when there is sufficient capacity
        NumArrayList testList = new NumArrayList(5);
        testList.add(1);    testList.add(2);    testList.add(4);    testList.add(5);

        testList.insert(2, 3);
        assertEquals("1.0 2.0 3.0 4.0 5.0", testList.toString());

        //Tests inserting when there is insufficient capacity
        NumArrayList testList2 = new NumArrayList(4);
        testList2.add(1);   testList2.add(2);   testList2.add(4);   testList2.add(5);

        testList2.insert(2, 3);
        assertEquals("1.0 2.0 3.0 4.0 5.0", testList2.toString());

        //Tests inserting to the end or beginning of the list
        NumArrayList testList3 = new NumArrayList(5);
        NumArrayList testList4 = new NumArrayList(5);
        testList3.add(2);   testList3.add(3);   testList3.add(4);   testList3.add(5);

        testList3.insert(0,1);
        assertEquals("1.0 2.0 3.0 4.0 5.0", testList3.toString());

        testList4.add(1);   testList4.add(2);   testList4.add(3);   testList4.add(4);

        testList4.insert(4,5);
        assertEquals("1.0 2.0 3.0 4.0 5.0", testList4.toString());
    }
    
    @Test 
    public void testRemove(){
        //Tests removing from the beginning of the list
        NumArrayList testList = new NumArrayList(5);
        testList.add(1);    testList.add(2);    testList.add(3);    testList.add(4);

        testList.remove(0);
        assertEquals("2.0 3.0 4.0", testList.toString() );

        //Tests removing from the end of the list
        NumArrayList testList2 = new NumArrayList(5);
        testList2.add(1);   testList2.add(2);   testList2.add(3);   testList2.add(4);

        testList2.remove(3);
        assertEquals("1.0 2.0 3.0", testList2.toString());

        //Tests removing from an empty list
        NumArrayList testList3 = new NumArrayList();
        testList3.remove(0);
        assertEquals("", testList3.toString());

        //Tests removing from the middle of the list
        NumArrayList testList4 = new NumArrayList(5);
        testList4.add(1);   testList4.add(2);   testList4.add(3);   testList4.add(4);

        testList4.remove(2);
        assertEquals("1.0 2.0 4.0", testList4.toString());

        //Tests attempting to remove an element that doesn't exist
        NumArrayList testList5 = new NumArrayList(5);
        testList5.add(1);   testList5.add(2);   testList5.add(3);   testList5.add(4);

        testList5.remove(4);
        assertEquals("1.0 2.0 3.0 4.0", testList5.toString());

        testList5.remove(5);
        assertEquals("1.0 2.0 3.0 4.0", testList5.toString());

    }
    
    @Test
    public void testContains(){
        //Tests if the given parameter is found when at the beginning of the list
        NumArrayList testList = new NumArrayList(5);
        testList.add(1);    testList.add(2);    testList.add(3);    testList.add(4);

        assertTrue(testList.contains(1.0));

        //Tests if the given parameter os found when at the end of the list
        assertTrue(testList.contains(4));

        //Tests if the given parameter is found when in the middle of the list
        assertTrue(testList.contains(2));

        //Tests if the method handles not finding the given value in the list
        assertFalse(testList.contains(5));

    }

    @Test
    public void testLookup(){
        //Test the lookup of an element in the beginning of the list
        NumArrayList testList = new NumArrayList(5);
        testList.add(1);    testList.add(2);    testList.add(3);    testList.add(4);    testList.add(5);

        assertEquals(0.0, testList.lookup(0), 0);

        //Test the lookup of an element in the end of the list
        assertEquals( 5.0, testList.lookup(4), 0);

        //Test the lookup of an element in the middle of the array
        assertEquals( 3.0, testList.lookup(2), 0);

        //Test that an exception is raised correctly
        NumArrayList testList2 = new NumArrayList(2);
        testList2.add(1);
        testList2.add(2);
        //assertThrows()
    }
    
    @Test
    public void testEquals(){
        //list containing 1,2,3,4,5 with a capacity of 5
        NumArrayList testList = new NumArrayList(5);
        testList.add(1);    testList.add(2);    testList.add(3);    testList.add(4);    testList.add(5);

        //list containing 1,2,3,4,5 with a capacity of 5
        NumArrayList testList2 = new NumArrayList(5);
        testList2.add(1);   testList2.add(2);   testList2.add(3);   testList2.add(4);   testList2.add(5);

        //list containing 1,2,3,4,5 with a capacity of 10
        NumArrayList testList3 = new NumArrayList(10);
        testList3.add(1);   testList3.add(2);   testList3.add(3);   testList3.add(4);   testList3.add(5);

        //list containing 1,2,3,4,5,6 with a capacity of 6
        NumArrayList testList4 = new NumArrayList(6);
        testList4.add(1);   testList4.add(2);   testList4.add(3);   testList4.add(4);   testList4.add(5);   testList4.add(6);

        //Tests that two lists with the same elements and size returns true
        assertTrue(testList.equals(testList2));

        //Tests that a list with the same elements as this but different capacity are still equal
        assertTrue(testList.equals(testList3));

        //Tests that a list that contains the same sequence of numbers within this list but has more numbers doesn't return true
        assertFalse(testList.equals(testList4));
    }
    
    @Test
    public void testRemoveDuplicates(){
        //Test the removal of many of the same number

        //Test the removal of many unique numbers

        //Test the removal of duplicates in the end of the list

    }
    
    @Test
    public void testToString(){

    }
}
