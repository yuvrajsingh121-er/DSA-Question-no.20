import java.util.*;
public class Array {
    public static int get_Largest(int array[]){
        int largest = Integer.MIN_VALUE; //-infinity
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<array.length; i++){
            if(largest < array[i]){
                largest = array[i];
            }

            if(smallest > array[i]){
                smallest = array[i];
            }
        }
        System.err.println("smallest value is: "+smallest);
        return largest;
    }
    public static void main(String[] args){
        int array[] ={1,2,3,4,5,6,7,8,9,10};
        System.err.println("largest value is: "+get_Largest(array));
    }
}
