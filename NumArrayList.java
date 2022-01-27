
/**
 * Write a description of class NumArrayList here.
 *
 * @author (Juan C Beaver)
 * @version (01/19/2022)
 */
public class NumArrayList implements NumList
{
    // instance variables - replace the example below with your own
    //commit test
    private double[] list;
    private int elementCount = 0;

    public static void main(String[] args) {
        NumArrayList test = new NumArrayList(5);
        test.add(1);    test.add(2);    test.add(3);    test.add(4);    test.add(5);    test.add(6);

        System.out.println(test);
    }

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
        return list.length - elementCount > amount;
    }

    public void increaseCapacity(){
        if(list.length > 0) {
            double[] newList = new double[list.length * 2];
            for (int i = 0; i <= list.length - 1; i++) {
                newList[i] = list[i];
            }
            list = newList;
        }
        else{
            list = new double[10];
        }
    }



    
    public int size(){
        return elementCount;
    }
    
    public int capacity(){
        return list.length-1;
    }
    
    public void add(double value){
        if (!canAdd(1)) {
            increaseCapacity();
        }
        list[elementCount] = value;
        elementCount++;
    }
    
    public void insert(int i, double value){
        if(elementCount <= i){
            if(!canAdd(1)){
                increaseCapacity();
            }
            list[elementCount] = value;
            elementCount++;
        }else{
            if(!canAdd(1)) {
                increaseCapacity();
            }
            for (int j = elementCount; j > i; j--) {
                list[j] = list[j - 1];
            }
            list[i] = value;
            elementCount++;

        }
    }
    
    public void remove(int i){
        if(list.length > 0) {
            if (i < elementCount - 1) {
                for (int j = i; j < elementCount; j++) {
                    list[j] = list[j + 1];
                }
                elementCount--;
            }
            else if(i == elementCount - 1){
                list[i] = 0.0;
                elementCount--;
            }
        }
    }
    
    public boolean contains(double value){
        for (int i = 0; i < elementCount; i++) {
            if(list[i] == value){
                return true;
            }
        }
        return false;
    }
    
    public double lookup(int i){

    }
    
    public boolean equals(NumList otherList){
        return false;
    }
    
    public void removeDuplicates(){
        //copy all numbers to new list and if newList contains i, skip.
        double[] newList = new double[elementCount + 5];

    
    }
    
    public String toString(){
        StringBuilder s2 = new StringBuilder();
        for(int i = 0; i < elementCount; i++){
            s2.append(list[i]);
            if(i < elementCount - 1){
                s2.append(" ");
            }
        }
        return s2.toString();
    }
}
