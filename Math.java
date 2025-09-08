public class Math{
    public static void main(String[] args) {
        /*
            Some common math functions
            Math.max(x, y) - returns the highest value of x and y
            Math.min(x, y) - returns the lowest value of x and y
            Math.sqrt(x) - returns the square root of x
            Math.abs(x) - returns the absolute (positive) value of x
            Math.random() - returns a random number between 0.0 and 1.0
            Math.round(x) - returns the value of x rounded to its nearest integer
            Math.ceil(x) - returns the value of x rounded up to its nearest integer
            Math.floor(x) - returns the value of x rounded down to its nearest integer
            Math.pow(x, y) - returns the value of x to the power of y (x^y)
        */

        System.out.println("Max of 5 and 10: " + Math.max(5, 10));
        System.out.println("Min of 5 and 10: " + Math.min(5, 10));
        System.out.println("Square root of 16: " + Math.sqrt(16));
        System.out.println("Absolute value of -10: " + Math.abs(-10));
        System.out.println("Random number: " + Math.random());
        System.out.println("Round 4.7: " + Math.round(4.7));
        System.out.println("Ceil of 4.3: " + Math.ceil(4.3));
        System.out.println("Floor of 4.7: " + Math.floor(4.7));
        System.out.println("2 to the power of 3: " + Math.pow(2, 3));
        

    }
}