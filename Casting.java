public class Casting {
    public static void main(String[] args) {
        // Implicit Casting (automatically) - converting a smaller type to a larger type size
        /* byte -> short -> char -> int -> long -> float -> double */

        int  age = 65;
        double newAge = age; // automatic casting: int to double
        System.out.println("Value of newAge: " + newAge);


        short s = 10;
        int i = s; // automatic casting: short to int
        System.out.println("Value of i: " + i);


        // Explicit Casting (manually) - converting a larger type to a smaller size type
        /* double -> float -> long -> int -> char -> short -> byte */

        double myDouble = 9.78d;
        int num = (int) myDouble; // manual casting: double to int
        System.out.println("Value of num: " + num); // Outputs 9

        int num = 65;
        char letter = (char) num; // manual casting: int to char
        System.out.println("Value of letter: " + letter); // Outputs 'A'
        
    }
}