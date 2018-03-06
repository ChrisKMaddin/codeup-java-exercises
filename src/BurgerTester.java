public class BurgerTester {
    public static void main(String[] args) {
        BurgerTools Student = new BurgerTools();

        Student.mostPopularTopping = "cheese";
        Student.averageDaysBeforeExpiration = 3;
        Student.temperatureWhenCooked = 450;

        System.out.println(Student.mostPopularTopping);
        System.out.println(Student.averageDaysBeforeExpiration);
        System.out.println(Student.temperatureWhenCooked);

        Student.grill();

    }
}


