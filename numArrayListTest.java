import org.junit.*;
import static org.junit.Assert.*;

/**
 * The test class numArrayListTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class numArrayListTest
{
    /**
     * Default constructor for test class numArrayListTest
     */
    public numArrayListTest()
    {
        NumArrayList test = new NumArrayList();
        
    }
    
    @Test
    public void testSize(){
        NumArrayList testList = new NumArrayList(5);
        
        NumArrayList testList2 = new NumArrayList(0);
        
        NumArrayList testList3 = new NumArrayList(1);
        
        NumArrayList testList4 = new NumArrayList();
        
        assertEquals(true, true);
    }
    
    @Test 
    public void testCapacity(){}
    
    @Test
    public void testAdd(){}

    @Test
    public void testInsert(){}
    
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
