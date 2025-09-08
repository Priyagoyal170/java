// Array is store multiple values of same data type
public class Array{
    public static void main(String[] args){ 
        //declaration and initialization of array
        int[] numbers = {10, 20, 30, 40, 50};

        //accessing array elements using for loop
        System.out.println("Array elements:");
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        //modifying an element in the array
        numbers[2] = 35; // changing the third element (index 2) to 35

        System.out.println("Modified Array elements:");
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }