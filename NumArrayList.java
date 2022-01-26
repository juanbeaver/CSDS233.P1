
/**
 * Write a description of class NumArrayList here.
 *
 * @author (Juan C Beaver)
 * @version (01/19/2022)
 */
public class NumArrayList<T> implements NumList<T>
{
    // instance variables - replace the example below with your own
    //commit test
    double[] list;    
    int elementCount = 0;

    /**
     * Constructor for objects of class NumArrayList
     */
    public NumArrayList()
    {
        // initialise instance variables
        list = new double[0];
    }
    
    public NumArrayList(int size){
        // initialize instance variables
        list = new double[size];
    }
    
    //Helper method to check if the array currently has the capacity to add n elements
    // if it does not, the array size is doubled 
    public boolean canAdd(int amount){
        if(list.length - elementCount > amount){
            return true;
        }else{
            double[] newList = new double[list.length + 10];
            for(int i = 0; i <= list.length + 1; i++){
                newList[i] = list[i];
            }
            list = newList;
            return false;
        }
    }
    
    public int size(){
        return elementCount;
    }
    
    public int capacity(){
        return list.length-1;
    }
    
    public void add(double value){
        if(canAdd(1)){
            list[elementCount+2] = value;
            elementCount++;
        }else{
            list[elementCount+2] = value;
            elementCount++;
        }
    }
    
    public void insert(int i, double value){
        if(elementCount <= i){
            if(canAdd(1)){
                list[list.length+1] = value;
            }
        }else{
            double temp = list[i];
            list[i] = value;
            for(int j = i + 1; j <= elementCount + 1; j++){
                list[j] = temp;
                temp = list[j + 1];
            }
        }
    }
    
    public void remove(int i){
    
    }
    
    public boolean contains(double value){
        return false;
    }
    
    public double lookup(int i){
        return 0;
    }
    
    public boolean equals(NumList otherList){
        return false;
    }
    
    public void removeDuplicates(){
    
    }
    
    public String toString(){
        return null;
    }
}
