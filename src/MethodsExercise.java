import java.util.Scanner;

public class MethodsExercise {
    public static void main(String[] args) {

        //1.Basic Arithmetic
        //Create four separate methods. Each will perform an arithmetic operation:

//        Addition

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int original_result = result;


////        Subtraction
//
        result = result - 1;
        // result is now 2
        System.out.println(original_result + " - 1 = " + result);
        original_result = result;
//
//
////        Multiplication
        result = result * 2;
        // result is now 4
        System.out.println(original_result + " * 2 = " + result);
        original_result = result;
//
//
////        Division
        result = result / 2;
        // result is now 2
        System.out.println(original_result + " / 2 = " + result);
        original_result = result;


//        Each function needs to take two parameters/arguments so that the operation can be performed.
//        Test your functions and verify the output.
//        Add a modulus function that finds the modulus of two numbers.

        int i = 10;
        int j = 3;

        System.out.println("i is " + i);
        System.out.println("j is " + j);

        int k = i % j;
        System.out.println("i%j is " + k);





//        2.Create a method that validates that user input is in a certain range
//
//        The method signature should look like this:
//
//
//        public static int getInteger(int min, int max);
//        and is used like this:
//
//
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//        If the input is invalid, prompt the user again.
//        Hint: recursion might be helpful here!






//        3.Calculate the factorial of a number.
//
//        Prompt the user to enter an integer from 1 to 10.
//        Display the factorial of the number entered by the user.
//        Ask if the user wants to continue.
//        Use a for loop to calculate the factorial.
//        Assume that the user will enter an integer, but verify it’s between 1 and 10.
//        Use the long type to store the factorial.
//        Continue only if the user agrees to.
//        A factorial is a number multiplied by each of the numbers before it.
//        Factorials are denoted by the exclamation point (n!). Ex:
//
//
//        1! = 1               = 1
//        2! = 1 x 2           = 2
//        3! = 1 x 2 x 3       = 6
//        4! = 1 x 2 x 3 x 4   = 24

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        //Stored the entered value in variable
        int num = scanner.nextInt();
        //Called the user defined function fact
        int factorial = fact(num);
        System.out.println("Factorial of entered number is: "+factorial);
    }
    static int fact(int n)
    {
        int output;
        if(n==1){
            return 1;
        }
        //Recursion: Function calling itself!!
        output = fact(n-1)* n;
        return output;







//        4.Create an application that simulates dice rolling.
//
//        Ask the user to enter the number of sides for a pair of dice.
//        Prompt the user to roll the dice.
//        "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//        Use static methods to implement the method(s) that generate the random numbers.
//        Use the .random method of the java.lang.Math class to generate random numbers.


        //You should use a while loop: The dice are rolled again and again until the player has won or lost (then, break ends the while loop).

//        while (true) {
//            int dice1=(int)(Math.random()*6+1);
//            int dice2=(int)(Math.random()*6+1);
//            int sum = dice1 + dice2;
//
//            System.out.println("Roll: total = " + sum);
//
//            if (sum==2 || sum==3 || sum==12) {
//                System.out.println("Sorry with a " + sum + " You LOSE :(");
//                break;
//            } else if(sum==7 || sum==11) {
//                System.out.println("Woah!!! With a " + sum + " You WIN!!!!!!!");
//                break;
//            }
//
//            // If you wanted, you could wait here for the user to confirm (e.g. with a key press)
//        }


        }
}