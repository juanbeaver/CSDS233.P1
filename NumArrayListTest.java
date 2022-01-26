import org.junit.*;
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
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(4);
        testList.add(5);
        assertEquals("1.0, 2.0, 3.0, 4.0, 5.0", testList.toString());

        //test adding to a list with insufficient capacity for the operation
        NumArrayList testList2 = new NumArrayList(1);
        testList2.add(1);
        //This next line should automatically increase the capacity of the list.
        testList2.add(2);
        assertEquals("1.0, 2.0", testList2.toString());

        //Test adding to a list that was initiated with a capacity of zero
        NumArrayList testList3 = new NumArrayList();
        testList3.add(1);
        testList3.add(2);
        testList3.add(3);
        assertEquals("1.0, 2.0, 3.0", testList3.toString());
    }

    @Test
    public void testInsert(){
        //Test inserting when there is sufficient capacity
        NumArrayList testList = new NumArrayList(5);
        testList.add(1);
        testList.add(2);
        testList.add(4);
        testList.add(5);
        testList.insert(2, 3);
        assertEquals("1.0, 2.0, 3.0, 4.0, 5.0", testList.toString());

        //Tests inserting when there is insufficient capacity
        NumArrayList testList2 = new NumArrayList(4);
        testList2.add(1);
        testList2.add(2);
        testList2.add(4);
        testList2.add(5);
        testList2.insert(2, 3);
        assertEquals("1.0, 2.0, 3.0, 4.0, 5.0", testList2.toString());

        //Tests inserting to the end or beginning of the list

    }
    
    @Test 
    public void testRemove(){}
    
    @Test
    public void testContains(){}

    @Test
    public void testLookup(){}
    
    @Test
    public void testEquals(){}
    
    @Test
    public void testRemoveDuplicates(){}
    
    @Test
    public void testToString(){}
}
