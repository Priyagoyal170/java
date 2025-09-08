public class Conditional{
    public static void main(String[] args) {
       /*
        // if statement
        if(condition){
            // code to be executed if condition is true
        }

        // if-else statement
        if(condition){
            // code to be executed if condition is true
        }else{
            // code to be executed if condition is false
        }

        // if-else-if ladder
        if(condition1){
            // code to be executed if condition1 is true
        }else if(condition2){
            // code to be executed if condition1 is false and condition2 is true
        }else{
            // code to be executed if both conditions are false
        }

        // switch statement
        switch(expression){
            case value1:
                // code to be executed if expression equals value1
                break;
            case value2:
                // code to be executed if expression equals value2
                break;
            default:
                // code to be executed if expression doesn't match any case
        }
       */

        // Example of if-else-if ladder
            int number = 20;
            if(number > 0){
                System.out.println(number + " is a positive number.");
            }else if(number < 0){
                System.out.println(number + " is a negative number.");
            }else{
                System.out.println("The number is zero.");
            }
            System.out.println();
        // Example of switch statement
            int day = 3;
            String dayName;
            switch(day){
                case 1:
                    dayName = "Monday";
                    break;
                case 2:
                    dayName = "Tuesday";
                    break;
                case 3:
                    dayName = "Wednesday";
                    break;
                case 4:
                    dayName = "Thursday";
                    break;
                case 5:
                    dayName = "Friday";
                    break;
                case 6:
                    dayName = "Saturday";
                    break;
                case 7:
                    dayName = "Sunday";
                    break;
                default:
                    dayName = "Invalid day";
            }
            System.out.println(dayName);
    }
}