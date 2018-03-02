import java.util.Scanner;
//import java.util.logging.SocketHandler;


public class MethodsExercise {
    public static void main(String[] args) {
//
//        //1.Basic Arithmetic
//        //Create four separate methods. Each will perform an arithmetic operation:
//
////        Addition
//
//        int result = 1 + 2;
//        System.out.println("1 + 2 = " + result);
//        int original_result = result;
//
//
//////        Subtraction
////
//        result = result - 1;
//        // result is now 2
//        System.out.println(original_result + " - 1 = " + result);
//        original_result = result;
////
////
//////        Multiplication
//        result = result * 2;
//        // result is now 4
//        System.out.println(original_result + " * 2 = " + result);
//        original_result = result;
////
////
//////        Division
//        result = result / 2;
//        // result is now 2
//        System.out.println(original_result + " / 2 = " + result);
//        original_result = result;
//
//
////        Each function needs to take two parameters/arguments so that the operation can be performed.
////        Test your functions and verify the output.
////        Add a modulus function that finds the modulus of two numbers.
//
//        int i = 10;
//        int j = 3;
//
//        System.out.println("i is " + i);
//        System.out.println("j is " + j);
//
//        int k = i % j;
//        System.out.println("i%j is " + k);

        //instructors solution

//        int userInt;
//        long factorialResult;
//
//        int number1 = getInteger(1, 100;
//        int number2 = getInteger(11, 33;
//
//        double sum = add(number1, number2);
//        double difference = subtract(number1, number2);
//        double product = multiplication(number1, number2);
//        double quotient = divide(number1, number2);
//
//        System.out.println("The sum of " + number1 + "and" + number2 + " is: " + sum);
//        System.out.println("The difference of " + number1 + "and" + number2 + " is: "  + difference);
//        System.out.println("The sum product sum of " + number1 + "and" + number2 + " is: " + product);
//        System.out.println("The quotient of " + number1 + "and" + number2 + " is: " + quotient);
//
//        System.out.println("Now we're going to calculate factorials!");
//        int userInt;
//        long factorialResult;
//
//        do {
//            userInt = getInteger(1, 10);
//            factorialResult = factorial(userInt);
//            System.out.println("The factorial for " + userInt + "! is" + factorialResult);
//        }while(wantsToContinue());
//
//        System.out.println("Thanks for playing \"Factorial!\"");
//
//        System.out.println("");
//        System.out.println("Now let's play \"Roll The Dice!\"");
//        diceRoller();
//
//
//        public static double add(double a, double b) {
//            return a + b;
//        }
//
//        public static double subtract(double a, double b) {
//            return a - b;
//        }
//
//        public static double multiplication(double a, double b) {
//            return a * b;
//        }
//
//        public static double divide(double a, double b) {
//            return a / b;
//        }
//
//        public static double modulo(double a, double b) {
//            return a % b;
//        }
//
//
//        public static int getInteger(int min, int max) {
//            System.out.println("Please input an integer between " + min + " and " + max + ":");
//            Scanner scan = new Scanner(Scanner(System.in);
//            int number = scan.nextInt();
//            if(number < min || number > max) {
//                return getInteger(min, max);
//            } else {
//                return number;
//            }
//        }
//
//        public static boolean wantstToContinue() {
//            System.out.println();
//            Scanner scan = new Scanner(System.in);
//            String userSelection;
//            boolean wantsToConinue;
//
//            System.out.println?("Would you like to continue?" Type \"y\" or yes to continue.");
//            userSelection = scan.next();
//            wantstToContinue = userSelection.equalsIgnoreCase(anotherString: "y") || userSelection.equalsIgnoreCase();
//
//        }









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

//        public static long factorial(int num) {
//            long output = num;
//
//            for(int i =1)
//        }






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

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        //Stored the entered value in variable
//        int num = scanner.nextInt();
//        //Called the user defined function fact
//        int factorial = fact(num);
//        System.out.println("Factorial of entered number is: "+factorial);
//    }
//    static int fact(int n)
//    {
//        int output;
//        if(n==1){
//            return 1;
//        }
//        //Recursion: Function calling itself!!
//        output = fact(n-1)* n;
//        return output;







//        4.Create an application that simulates dice rolling.
//
//        Ask the user to enter the number of sides for a pair of dice.
//        Prompt the user to roll the dice.
//        "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//        Use static methods to implement the method(s) that generate the random numbers.
//        Use the .random method of the java.lang.Math class to generate random numbers.


        //You should use a while loop: The dice are rolled again and again until the player has won or lost (then, break ends the while loop).

        while (true) {
            int dice1=(int)(Math.random()*6+1);
            int dice2=(int)(Math.random()*6+1);
            int sum = dice1 + dice2;

            System.out.println("Roll: total = " + sum);

            if (sum==2 || sum==3 || sum==12) {
                System.out.println("Sorry with a " + sum + " You LOSE :(");
                break;
            } else if(sum==7 || sum==11) {
                System.out.println("Woah!!! With a " + sum + " You WIN!!!!!!!");
                break;
            }

            // If you wanted, you could wait here for the user to confirm (e.g. with a key press)
        }


        //INTRUCTORS SOLUTION
//        import java.util.Scanner;
//
//        public class MethodsExercises {
//            public static void main(String[] args) {
//
//                int number1 = getInteger(1, 10);
//                int number2 = getInteger(10, 33);
//
//                double sum = add(number1, number2);
//                double difference = subtract(number1, number2);
//                double product = multiplication(number1, number2);
//                double quotient = divide(number1, number2);
//
//                System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum);
//                System.out.println("The difference of " + number1 + " and " + number2 + " is: " + difference);
//                System.out.println("The sum product of " + number1 + " and " + number2 + " is: " + product);
//                System.out.println("The quotient of " + number1 + " and " + number2 + " is: " + quotient);
//
//                System.out.println("Now we're going to calculate factorials!");
//                int userInt;
//                long factorialResult;
//
//                do {
//                    userInt = getInteger(1, 10);
//                    factorialResult = factorial(userInt);
//                    System.out.println("The factorial for " + userInt + "! is " + factorialResult);
//                } while(wantsToContinue());
//
//                System.out.println("Thanks for playing \"Factorial!\"");
//
//                System.out.println();
//                System.out.println("Now let's play \"Roll The Dice!\"");
//                diceRoller();
//            }
//
//            public static double add(double a, double b) {
//                return a + b;
//            }
//
//            public static double subtract(double a, double b) {
//                return a - b;
//            }
//
//            public static double multiplication(double a, double b) {
//                return a * b;
//            }
//
//            public static double divide(double a, double b) {
//                return a / b;
//            }
//
//            public static double modulo(double a, double b) {
//                return a % b;
//            }
//
//            public static int getInteger(int min, int max) {
//                System.out.println("Please input an integer between " + min + " and " + max + ":");
//                Scanner scan = new Scanner(System.in);
//                int number = scan.nextInt();
//                if(number < min || number > max) {
//                    return getInteger(min, max);
//                } else {
//                    return number;
//                }
//            }
//
//            public static boolean wantsToContinue() {
//                System.out.println();
//                Scanner scan = new Scanner(System.in);
//                String userSelection;
//                boolean wantsToContinue;
//
//                System.out.println("Would you like to continue? Type \"y\" or yes to continue.");
//                userSelection = scan.next();
//                wantsToContinue = userSelection.equalsIgnoreCase("y") || userSelection.equalsIgnoreCase("yes");
//
//                return wantsToContinue;
//            }
//
//            public static long factorial(int num) {
//                // set the output at
//                long output = num;
//
//                // start w/ 1, then multiply by each number up to but not including the num.
//                for(int i = 1; i < num; i++) {
//                    output *= i;
//                }
//
//                return output;
//            }
//
//
//            public static void diceRoller() {
//                diceSplash();
//
//                System.out.println("How many sides should each die have?");
//                int sides = getInteger(1, 100);
//                int die1;
//                int die2;
//                int result;
//
//                die1 = roll(sides);
//                System.out.println("The first die rolled a " + die1);
//
//                die2 = roll(sides);
//                System.out.println("The second die rolled a " + die2);
//
//                result = die1 + die2;
//                System.out.println("Result of both dice is: " + result);
//
//                if(wantsToContinue()) {
//                    diceRoller();
//                } else {
//                    System.out.println("Thanks for playing \"D I C E   R O L L E R \"!");
//                }
//
//            }
//
//            public static int roll(int numberOfSides) {
//                return (int) Math.ceil(Math.random() * numberOfSides);
//            }
//
//            public static void diceSplash() {
//                String display1 = "\n\n" +
//                        "       .-------.    ______\n" +
//                        "      /   o   /|   /\\     \\\n" +
//                        "     /_______/o|  /o \\  o  \\\n" +
//                        "     | o     | | /   o\\_____\\\n" +
//                        "     |   o   |o/ \\o   /o    /\n" +
//                        "     |     o |/   \\ o/  o  /\n" +
//                        "     '-------'     \\/____o/ \n\n\n";
//
//                String display2 = "\n" +
//                        "              _______.\n" +
//                        "   ______    | .   . |\\\n" +
//                        "  /     /\\   |   .   |.\\\n" +
//                        " /  '  /  \\  | .   . |.'|\n" +
//                        "/_____/. . \\ |_______|.'|\n" +
//                        "\\ . . \\    /  \\ ' .   \\'|\n" +
//                        " \\ . . \\  /    \\____'__\\|\n" +
//                        "  \\_____\\/"
//                        + "\n\n";
//
//
//                String display3 = "\n" +
//                        "  ____\n" +
//                        " /\\' .\\    _____\n" +
//                        "/: \\___\\  / .  /\\\n" +
//                        "\\' / . / /____/..\\\n" +
//                        " \\/___/  \\'  '\\  /\n" +
//                        "          \\'__'\\/"
//                        + "\n\n";
//
//                int randomDisplay = roll(3);
//
//                String display;
//
//                if(randomDisplay == 1) {
//                    display = display1;
//                } else if(randomDisplay == 2) {
//                    display = display2;
//                } else {
//                    display = display3;
//                }
//
//                System.out.println(display);
            }


        }


