public class Escape{
    public static void main(String[] args) {
      /*
        \n - New Line
        \t - Tab
        \b - Backspace
        \r - Carriage Return
        \f - Form Feed
        \\ - Backslash
        \' - Single Quote
        \" - Double Quote
      */
        System.out.println("Hello\nWorld"); // Outputs Hello (in first line) World (in second line)
        System.out.println("Hello\tWorld"); // Outputs Hello (tab space) World
        System.out.println("Hello\bWorld"); // Outputs HellWorld (backspace removes the character
        System.out.println("Hello\rWorld"); // Outputs World (carriage return moves the cursor to the beginning of the line)
        System.out.println("Hello\fWorld"); // Outputs Hello (form feed may not be visible in some environments)
        System.out.println("Hello\\World"); // Outputs Hello\World
        System.out.println("Hello\'World"); // Outputs Hello'World
        System.out.println("Hello\"World"); // Outputs Hello"World  
        
      
    }
}