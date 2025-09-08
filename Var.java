public class Var{
    public static void main(String[] args) {
        var a = 5;        // a is int
        var b = 5.5;      // b is double
        var c = "Hello";  // c is String
        var d = 'A';     // d is char
        var e = true;    // e is boolean

        // var x; // Error: var must be initialized with a value
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        System.out.println("Value of c: " + c);
        System.out.println("Value of d: " + d);
        System.out.println("Value of e: " + e);
    }
}