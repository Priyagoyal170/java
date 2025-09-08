public class DataTypes{
    public static void main(String[] args){
        //Primitive Data Types
        //1. byte(-128 to 127)
        byte a=5;
        System.out.println("value of a :" +a);
        //2. short(-32,768 to 32,767)
        short b= 1200;
        System.out.println("value of b :" +b);
        //3. int(-2,147,483,648 to 2,147,483,647)
        int c= 200000;
        System.out.println("value of c :" +c);
        //4. long(-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
        long d=6578934;
        System.out.println("Value of d :" +d);
        //5. float(6 to 7 decimal digits)
        float e= 67.89f;
        System.out.println("Value of e :" +e);
        //6. double(15 decimal digits)
        double f= 67.890123456789;
        System.out.println("Value of f :" +f);

        /* Double has more precision than float.
          Float is used when you need to save memory in large arrays of floating point numbers.
          Double is generally used as the default data type for decimal values.
         */

        //7. char(single 16-bit Unicode character) 
        char g='A';
        System.out.println("Value of g :" +g);
        //8. boolean(true or false) 
        boolean h=true;
        System.out.println("Value of h :" +h);


        // Non-Primitive Data Types Or Reference Data Types (refer to objects)
        //1. String or SPECIAL 9TH TYPE
        String name="Akansha";
        System.out.println("Value of name :" +name);
        //2. Array
        int[] arr={1,2,3,4,5};  
        System.out.println("Value of arr[0] :" +arr[0]);
        //3. Class 
        //4. Interface
        //5. Enum

    }
}