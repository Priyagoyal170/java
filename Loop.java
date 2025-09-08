public class Loop{
    public static void main(String[] args) {
       /*
        // For Loop
        for(initialization; condition; increment/decrement){
            // code to be executed
        }

        // While Loop
        initialization;
        while(condition){
            // code to be executed
            increment/decrement;
        }

        // Do-While Loop
        initialization;
        do{     
            // code to be executed
            increment/decrement;
        }while(condition);

        // Nested Loop
        for(initialization; condition; increment/decrement){
            for(initialization; condition; increment/decrement){
                // code to be executed
            }
        }

        //foreach loop (enhanced for loop)
        for(dataType variable : arrayName){
            // code to be executed
        }

       */

        // Example of For Loop
            System.out.println("For Loop:");
            for(int i = 1; i <= 5; i++){
                System.out.println(i);
            }
            System.out.println();
        // Example of While Loop    
            System.out.println("While Loop:");
            int j = 1;
            while(j <= 5){
                System.out.println(j);
                j++;   
       }
            System.out.println();
        // Example of Do-While Loop
            System.out.println("Do-While Loop:");
            int k = 1;
            do{
                System.out.println(k);
                k++;
            }while(k <= 5);

        // Nested Loop
            System.out.println("Nested Loop:");
            for(int m = 1; m <= 3; m++){
                for(int n = 1; n <= 2; n++){
                    System.out.println("m: " + m + ", n: " + n);
                }
            }
            System.out.println();
        // Example of foreach loop (enhanced for loop)
            System.out.println("Foreach Loop:");
            int[] numbers = {10, 20, 30, 40, 50};
            for(int num : numbers){
                System.out.println(num);
            }    
    }
}