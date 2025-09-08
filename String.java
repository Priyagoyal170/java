// String is a collection of characters wrapped in double quotes not single quotes

public class String{
    public static void main(String[] args) {
        String greeting = "Hello, World!";
        String name = "  Alice  ";
        System.out.println(greeting);

        //some inbuilt methods of String class
        System.out.println("Length of greeting: " + greeting.length()); // Outputs 13
        System.out.println("Character at index 7: " + greeting.charAt(7)); // Outputs 'W'
        System.out.println("Substring from index 7 to 12: " + greeting.substring(7, 12)); // Outputs 'World'
        System.out.println("Greeting in uppercase: " + greeting.toUpperCase()); // Outputs 'HELLO, WORLD!'
        System.out.println("Greeting in lowercase: " + greeting.toLowerCase()); // Outputs 'hello, world!'
        System.out.println("Greeting concatenated with name: " + greeting + " " + name); // Outputs 'Hello, World! Alice'
        System.out.println("Greeting replaced 'World' with 'Java': " + greeting.replace("World", "Java")); // Outputs 'Hello, Java!'
        System.out.println("check both string are equal or not: " + greeting.equals(name)); // Outputs false
        System.out.println("Trimmed name:" + name.trim()); // Outputs 'Alice'
        

    }
}