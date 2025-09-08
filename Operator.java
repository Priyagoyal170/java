public class Operator{
    public static void main(String[] args){
        //OPERATORS (Performs operations on variables and values)

        /* 1. Arithmetic Operators
            +   Addition    
            -   Subtraction
            *   Multiplication
            /   Division
            %   Modulus
            ++  Increment
            --  Decrement
        */

       int a = 10;
       int b = 5;   
        System.out.println("a + b = " + (a + b));     // Addition
        System.out.println("a - b = " + (a - b));    // Subtraction
        System.out.println("a * b = " + (a * b));   // Multiplication
        System.out.println("a / b = " + (a / b));  // Division
        System.out.println("a % b = " + (a % b)); // Modulus
        System.out.println("a++ = " + (a++));    // Post Increment
        System.out.println("++a = " + (++a));   // Pre Increment
        System.out.println("b-- = " + (b--));  // Post Decrement
        System.out.println("--b = " + (--b)); //Pre Decrement


        /* 2. Assignment Operators
            =   x = 5   (assigns the value of 5 to x)
            +=  x += 3  (adds 3 to x)
            -=  x -= 3  (subtracts 3 from x)
            *=  x *= 3  (multiplies x by 3)
            /=  x /= 3  (divides x by 3)
            %=  x %= 3  (assigns the remainder of x divided by 3 to x)
            &=  x &= 3  (bitwise AND assignment   **if both value are true then output is true otherwise false)
            |=  x |= 3  (bitwise OR assignment    **if any one value is true then output is true otherwise false)
            ^=  x ^= 3  (bitwise XOR assignment   **if both values are different then output is true otherwise false)
            >>= x >>= 3 (right shift assignment   ** x/2^3)
            <<= x <<= 3 (left shift assignment    ** x*2^3)    
        */


        int x = 10; // assigns 10 to x
        System.out.println("x = " + x);
        x += 3; // x = x + 3
        System.out.println("x += 3: " + x);
        x -= 3; // x = x - 3
        System.out.println("x -= 3: " + x); 
        x *= 3; // x = x * 3
        System.out.println("x *= 3: " + x);     
        x /= 3; // x = x / 3
        System.out.println("x /= 3: " + x);
        x %= 3; // x = x % 3
        System.out.println("x %= 3: " + x);
        x &= 3; // x = x & 3
        System.out.println("x &= 3: " + x);
        x |= 3; // x = x | 3
        System.out.println("x |= 3: " + x);     
        x ^= 3; // x = x ^ 3
        System.out.println("x ^= 3: " + x);
        x >>= 3; // x = x >> 3
        System.out.println("x >>= 3: " + x);
        x <<= 3; // x = x << 3
        System.out.println("x <<= 3: " + x);

        /* 3. Comparison Operators
            ==  Equal to
            !=  Not equal to
            >   Greater than
            <   Less than
            >=  Greater than or equal to
            <=  Less than or equal to
        */

        int p = 10;
        int q = 5;
        System.out.println("p == q: " + (p == q)); // Equal to
        System.out.println("p != q: " + (p != q)); // Not equal to
        System.out.println("p > q: " + (p > q));   // Greater than
        System.out.println("p < q: " + (p < q));   // Less than
        System.out.println("p >= q: " + (p >= q)); // Greater than or equal to
        System.out.println("p <= q: " + (p <= q)); // Less than or equal to 


        /* 4. Logical Operators
            &&  Logical AND     **if both value are true then output is true otherwise false
            ||  Logical OR      **if any one value is true then output is true otherwise false
            !   Logical NOT     **reverses the logical state of its operand
        */

       
        boolean val1 = true;
        boolean val2 = false;
        System.out.println("val1 && val2: " + (val1 && val2)); // Logical AND
        System.out.println("val1 || val2: " + (val1 || val2)); // Logical OR
        System.out.println("!val1: " + (!val1));           // Logical NOT
        System.out.println("!val2: " + (!val2));           // Logical NOT   

    }
}