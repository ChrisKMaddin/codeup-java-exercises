//package movies;
//
//import java.util.Scanner;
//
//public class MoviesApplication {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("0 - exit\n1 - view all movies\n2 - view movies in the animated category\n3 - view movies in the drama category\n4 - view all movies in the horror category\n5 - view all movies in the sci-fi category");
//        System.out.print("Selection: ");
//        int movieSelector = in.nextInt();
//
//
//        switch (movieSelector) {
//            case 0:
//                System.out.println("exit");
//                break;
//            case 1:
//                for (int i = 0; i < MoviesArray.findAll().length; i++) {
//                    System.out.println(MoviesArray.findAll()[i].getName() + " - " + MoviesArray.findAll()[i].getCategory());
//                }
//                break;
//            case 2:
//
////                for (int i = 0; i < MoviesArray.findAll().length; i++) {
////                if (MoviesArray.equals().category());
////                System.out.println(MoviesArray.findAll()[i].getName() + MoviesArray.findAll()[i].getCategory());
//////                }
////                    break;
////                    case 3:
//////                        for (int i = 0; i < MoviesArray.findAll.().length; i++) {
//////                        System.out.println(MoviesArray.findAll()[i].getCategory() + MoviesArray.findAll()[].getName());
////                        break;
////                    case 4:
//////                        for (int i = 0; i < MoviesArray.findAll().length; i++) {
//////                        System.out.println(MoviesArray.findAll()[i].getCategory() + MoviesArray.findAll()[i].getName());
////                        break;
////                    case 5:
//////                        for (int i = 0; i < MoviesArray.findAll().length; i++) {
//////                        System.out.println("sci-fi category");
////                        break;
////                    default:
//////                        for (int i = 0; i < MoviesArray.findAll().length; i++) {
//////                        System.err.println("Unrecognized option");
////                        break;
//                }
//        }
//    }
//
//
//instructors solution
//
//package movies;
//
//import util.Input;
//
///**
// * 1. Show all the movies
// * 2. Extract a method
// * 3. Change our method to handle categories (overload)
// * 4. De-duplicate
// *
// * 5. Deal with user input
// */
//public class MoviesApplication {
//    public static input = new Input();
//
//    public static void showMovie(Movie movie) {
//        System.out.printf(
//                "Title: %s -- Category: %s\n",
//                movie.getName(),
//                movie.getCategory()
//        );
//    }
//
//    public static void showMovies() {
//        Movie[] movies = MoviesArray.findAll();
//
//        for(Movie movie : movies) {
//            showMovie(movie);
//        }
//    }
//
//    public static void showMovies(String category) {
//        Movie[] movies = MoviesArray.findAll();
//
//        for(Movie movie : movies) {
//            if (! movie.getCategory().equals(category)) {
//                continue;
//            }
//            showMovie(movie);
//        }
//    }
//
//    public static void main(String[] args) {
//        do {
//            System.out.println("What would you like to do?");
//            System.out.println("0 - exit");
//            System.out.println("1 - view all movies");
//            System.out.println("2 - view musicals");
//
//            Input input = new Input();
//            int userChoice = input.getInt(1, 2, "Your choice? ");
//
//            switch (userChoice) {
//                case 0:
//                    System.exit(0);
//                case 1:
//                    showMovies();
//                    break;
//                case 2:
//                    showMovies("musical");
//                    break;
//                case 3:
//                    addMovie();
//                    break;
//                    default:
//                    System.out.println("ERROR: we should never get here.");
//                    break;
//            }
//        } while(true);
//    }
//
//    private static void addMovie() {
//        //1.get some input from the user (title + cat)
//        String name = input.getString();
//        String category = input.getString();
//        //Create a movie object based on the user input
//        Movie newMovie = new Movie(title, genre);
//        //3."add" that movie to the movies array
//        //a create a copy of the array with a longer length
//        Movie[] moviesPlus = Arrays.copyOf(movies, movies.length + 1);
//        //b add the new movie to the copy (set the item at the last index to our new movie
//        int lastIndex = moviePlus.length -1;
//        moviesPlus[lastIndex] = newMovie;
//        //3c. reassign the movies property to our new array
//        movies = moviesPlus;
//
//    }
//
//    public static void main(String[] args) {
//        showMenu();
//    }
//}