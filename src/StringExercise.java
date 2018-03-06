import java.lang.ref.SoftReference;

public class StringExercise {
    public static void main(String[] args) {


//        For each of the following output examples, create a string variable named message
//        that contains the desired output and print it out to the console.
//
//        Do this with only one string variable and one print statement.

//        We don't need no education
//        We don't need no thought control

//        String message = "We don't need no education,\n"+
//                "We don't need no thought control";
//        System.out.println(message);
//
////        Check "this" out!, "s inside of "s!
//
////        String out = "Check "this" out!,\n" + "s inside of" "s!";
////        System.out.println(out);
//
//        //  In windows, the main drive is usually C:\
//
//        String windows = "In Windows, the main drive is usually C:";
//        System.out.println(windows);
//
//        //        I can do backslashes \, double backslashes \\,
////        and the amazing triple backslash \\\!
//
//        String slashes = "I can do backslashes \\, double backslashes \\\\,\n"+
//        "and the amazing triple backslash \\\\\\!";
//        System.out.println(slashes);

        String message = "We don't need no education\nWe don't need no thought control";

        message += "\n\n";
        message += "Check \"this\" out!, \"s inside of \"s!";

        message += "\n\n";
        message += "String windows = \"In Windows, the main drive is usually C:\";";

        message += "\n\n";
        message += "\"I can do backslashes \\\\, double backslashes \\\\\\\\,\\n\"+\n" +
                "//        \"and the amazing triple backslash \\\\\\\\\\\\!\";";
        System.out.println(message);


        }
}


//
//public class StringExercise {
//    public static void main(String[] args) {
//        String message = "We don't need no education\nWe don't need no thought control!";
//
//        message += "\n\n";
//        message += "Check \"this\" out!, \"s inside of \"s!";
//
//        message += "\n\n";
//        message += "In windows, the main drive is usually C:\\" + "\n";
//
//        message += "\n\n";
//        message += "I can do backslashes \\, double backslashes \\\\,\nand the amazing triple backslash \\\\\\!";
//
//        System.out.println(message);
//    }
//}