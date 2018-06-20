//
//
//public class fizzbuzz {
//    public static void main(String[] args) {
//        for (int i = 1; i<= 100; i++){
//            boolean fizzOrBuzz = false;
//            if (i % 3 == 0) {
//                System.out.println("Fizz");
//                fizzOrBuzz = true;
//            }
//            if (i % 5 == 0){
//                System.out.println("Buzz");
//                fizzOrBuzz = true;
//            }
//            if (fizzOrBuzz) {
//                System.out.println();
//            } else {
//                System.out.println(String.valueOf(i));
//            }
//        }
//    }
//}

//class FizzBuzz{
//    public static void main(String[] args){
//        for(int i= 1; i <= 100; i++){
//            String output = "";
//            if(i % 3 == 0) output += "Fizz";
//            if(i % 5 == 0) output += "Buzz";
//            if(output.equals("")) output += i;
//            System.out.println(output);
//        }
//    }
//}

//class FizzBuzz{
//    public static void main(String[] args){
//        for(int i= 1; i <= 100; i++){
//            if(i % 15 == 0){
//                System.out.println("FizzBuzz");
//            }else if(i % 3 == 0){
//                System.out.println("Fizz");
//            }else if(i % 5 == 0){
//                System.out.println("Buzz");
//            }else{
//                System.out.println(i);
//            }
//        }
//    }
//}

//class FizzBuzz{
//    public static void main(String[] args){
//        for(int i= 1; i <= 100; i++){
//            System.out.println(i % 15 != 0 ? i % 5 != 0 ? i % 3 != 0 ?
//                    String.valueOf(i) : "Fizz" : "Buzz" : "FizzBuzz");
//        }
//    }
//}

