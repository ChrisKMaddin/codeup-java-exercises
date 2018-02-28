import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        Loop Basics
//
//        While
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:

        //my solution
//        int i = 5;
//        while (i <= 15) {
//            System.out.print("i is " + i);
//            i++;
//        }
//        System.out.println(i);

        //instructors solution
//        int = 5;
//        while (i <= 15) {
//            System.out.print(i + " ")
//            i += 1;
//        }




//        Do While
//
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        Alter your loop to count backwards by 5's from 100 to -10.
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//        //count to 100
//
//        int count = 0;
//        do {
//            System.out.println("Count is: " + count);
//            count++;
//        } while (count < 100);

//        private static void calculate() {
//            int currentSolution = 1;
//            for (int i = 1; i < 100; i++) {
//                currentSolution *= i;
//            }
//            System.out.println(currentSolution);
//        }

        //instructors solution
//                int num = 0;
//
//                do {
//                    System.out.println(num);
//                    num += 2;
//                } while (num <= 100);
//
//                int num = 100;
//
//                do {
//                    System.out.println(num);
//                    num += 2;
//                }while (num >= -10);







//For
//
//refactor the previous two exercises to use a for loop instead
//
//
//                long num = 2;
//
//                do {
//                    System.out.println(num);
//                    num *= num;
//                } while (num <= 1000000);
//
//
//        int num1 = 100;
//        do {
//            System.out.println(num1);
//            num -= 5;
//        }while (num1 >= -10);
//
//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }
//
//        long num = 2;
//
//        do {
//            System.out.println(num);
//            num *= num;
//        } while (num <= 1000000);
//
//        for (long i = 2; i <= 1000000; i *= i) {
//            System.out.print(i);
//        }



//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to test basic looping and conditional logic skills.
//
//                Write a program that prints the numbers from 1 to 100.
//        For multiples of three print “Fizz” instead of the number
//        For the multiples of five print “Buzz”.
//        For numbers which are multiples of both three and five print “FizzBuzz”.


        //fizzbuzz 1
//        for (int i = 1; i <= 100; i++) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(String.valueOf(i));
//            }
//        }

        //fizzbuzz 2
//
//            if (number % 3 == 0) {
//                if (number % 5 == 0) {
//                    return "fizzbuzz";
//                } else {
//                    return "fizz";
//                }
//            } else if (number % 5 == 0) {
//                return "buzz";
//            }
//            return String.valueOf(number);
//        }

//        Read more:http:
////www.java67.com/2015/10/how-to-solve-fizzbuzz-in-java.html#ixzz58Q04fFsP

        //fizzbuzz 3
//        for (int i = 1; i <= 100; i++) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        //instructors solution

//        for (int i = 1); i <= 100; i += 1) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                } else {
//                System.out.println(i);
//            }
//        }





//
//        Display a table of powers.
//
//                Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.



//        System.out.println("Welcome to the Squares and Cubes table");
//        System.out.println();
//
//
//        Scanner sc = new Scanner(System.in);
//        String choice = "y";
//
//        do {
//            // Get input from the user
//            System.out.print("Enter an integer: ");
//            int integer = sc.nextInt();
//
//            // Create a header
//            String header = "Number  " + "Squared " + "Cubed   " + "\n"
//                    + "======  " + "======= " + "=====   ";
//            System.out.println(header);
//
//            int square = 5;
//            int cube = 5;
//
//            String row = "";
//            for (int i = 1; i <= integer; i++) {
//
//                square = i * i;
//                cube = i * i * i;
//
//                row = i + "       " + square + "       " + cube;
//                System.out.println(row);
//            }
//
//            // See if the user wants to continue
//            System.out.print("Continue? (y/n): ");
//            choice = sc.next();
//            System.out.println();
//
//        }


        //instructors solution


//        Scanner sc = new Scanner(System.in);
//        boolean userContinues = true;
//
//        do {
//            System.out.print("What number would you likeot go up to> ");
//            in userInt = sc.nextInt(;
//            System.out.println();
//            System.out.println("Here is your table!");
//            System.out.println();
//            System.out.println(""number | squared | cubed")" +
//                    System.out.println("----")
//        }








//
//        Convert given number grades into letter grades.
//
//                Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//                Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0



//        public static String letterGrade(double grade) {
//            String a = "A";
//            String b = "B";
//            String c = "C";
//            String d = "D";
//            String f = "F";
//        while (!choice.equalsIgnoreCase("n"));
//
//        if (grade <= 100 && grade >= 90) {
//            return a;
//        } else if (grade < 90 && grade >= 80) {
//            return b;
//        } else if (grade < 80 && grade >= 70) {
//            return c;
//        } else if (grade < 70 && grade >= 60) {
//            return d;
//        } else if (grade < 60) {
//            return f;
//        } else
//            return "An error has occured. You entered an invalid grade";

//        System.out.println("Welcome to the Letter Grade Converter");
//        System.out.println();
//
//        Scanner sc = new Scanner(System.in);
//
//        String choice = "y";
//        while (choice.equalsIgnoreCase("y")){
//
//            System.out.println("Enter numerical grade: ");
//            int grade = sc.nextInt();
//            char letter = 0;
//            if(grade <= 100 || grade >= 88)
//                letter = 'A';
//            System.out.println("Your Grade is: " + letter);
//            if (grade <= 87 || grade >= 80)
//                letter = 'B';
//            System.out.println("Your Grade is: " + letter);
//
//            if (grade <= 79 || grade >= 67)
//                letter = 'C';
//            System.out.println("Your Grade is: " + letter);
//
//            if(grade <= 66 || grade >= 60)
//                letter = 'D';
//            System.out.println("Your Grade is: " + letter);
//
//            if(grade <= 60)
//                letter = 'F';
//            System.out.println("Your Grade is: " + letter);
//            System.out.println("Continue? (y/n): ");
//            choice = sc.next();
//            System.out.println();
//        }
    }
}