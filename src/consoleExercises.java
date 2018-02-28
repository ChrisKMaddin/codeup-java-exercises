import java.util.Scanner;

public class consoleExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer value");

        System.out.println("Enter 3 words\n");
        String wordOne = scanner.next();
        String wordTwo = scanner.next();
        String wordThree = scanner.next();

        System.out.println(wordOne);
        System.out.println(wordTwo);
        System.out.println(wordThree);


        scanner.nextLine();//This the extra \n (enter)

        System.out.println("Enter the width of the classroom");
        double width = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter the length of the classroom");
        double length = Double.parseDouble(scanner.nextLine());


        }
}



