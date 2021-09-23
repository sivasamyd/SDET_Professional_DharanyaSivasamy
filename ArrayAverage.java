package program2;

public class ArrayAverage {
	public static void main(String[] args) {
		 
        // create an array
        int[] array = { 1, 2, 3, 4, 5 };
 
        // getting array length
        int length = array.length;
 
        // default sum value.
        int sum = 0;
 
        // sum of all values in array using for loop
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
 
        int average = sum / length;
         
        System.out.println("Average of array : "+average);
 
    }
}
