import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] nouns = {"Rabbit","Horse", "Bear", "Pig", "Cow", "Rhino", "Zebra", "Cat", "Dog", "Rat"};
        shuffle(nouns, 50);
        String[] adjectives = {"Good", "New", "Old", "Important", "Early", "Late", "Different", "Young", "Smart", "Stubborn"};
        shuffle(adjectives, 50);

        for(int i = 0; i < nouns.length && i < adjectives.length; i++) {
            System.out.println(adjectives[i] + "-" + nouns[i]);
        }
    }

    public static void shuffle(String[] list, int swapCount) {
        Random random = new Random();
        for(int i = 0; i < swapCount; i++) {
            int index1 = random.nextInt(list.length);
            int index2 = random.nextInt(list.length);


            String temp = list[index1];
            list[index1] = list[index2];
            list[index2] = temp;
        }
    }
}


//Instructors Solution

//import java.util.Random;

//public class ServerNameGenerator {
//    public static Random rng = new Random();
//
//    public static final string[] adjectives = {"blue, "green", "red", "quirky", "simple", "dedicated"};
//    public static final string[] nouns = {"photon", "neutron", "quark", "function", "loop"};
//
//            public static String getRandomString(String[] coll) {
//    int randomIndex = rng.nextInt(coll.length);
//    return coll[randomIndex];
//    }
//    public static String get ServerName() {
//        return String.format(
//                "%s-%s",
//                getRandomString(adjectives),
//                getRandomString(nouns)
//        );
//    }
//
//    public static void main(string[] args) {
//        System.out.println("Here is your server name: " + getServerName());
//    }
//}
//

