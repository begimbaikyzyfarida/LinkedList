import java.util.*;
import java.util.concurrent.Callab
public class Main {
    public static void main(String[] args) {


        Director director = new Director("Erkin", "John Dae");
        LinkedList<Cast> casts = new LinkedList<>();
        Cast cast = new Cast("Angelina", "SuperStar");
        Cast cast1 = new Cast("Johny depp", "Killer");
        casts.add(cast);
        casts.add(cast1);

        Director director1 = new Director("Adel", "Sam Smith");
        LinkedList<Cast> casts1 = new LinkedList<>();
        Cast cast2 = new Cast("William", "Driver");
        Cast cast3 = new Cast("Sam Smith", "GirlFriend");
        casts1.add(cast2);
        casts1.add(cast3);

        LinkedList<Movie> movies = new LinkedList<>();
        Movie movie = new Movie("Happiness", 2022, "Comedy", director, casts);
        movies.add(movie);

        LinkedList<Movie> movies1 = new LinkedList<>();
        Movie movie1 = new Movie("Avatar", 2000, "Horror", director1, casts1);
        movies.add(movie1);

        LinkedList<Movie> allMovies = new LinkedList<>();
        allMovies.addAll(movies);
        allMovies.addAll(movies1);

        LinkedList<Director> directors = new LinkedList<>();
        directors.add(director);
        directors.add(director1);


        FindService findService = new FindService(allMovies);
        SortService sortService=new SortService(allMovies);

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Get all movie");
        System.out.println("2. Find movie by actor name");
        System.out.println("3. Find movie by director");
        System.out.println("5. Find movie by genre");
        System.out.println("6. Find movie by year");
        System.out.println("7. Find movie by fullName, or partName");
        System.out.println("8. Find movie by role");
        System.out.println("9. Sort movie year in descending and ascending order");
        System.out.println("10. Sort movie by name in descending and ascending order");
        System.out.println("11. Sort directors ascending and descending orders");
        System.out.println("12. Exit");

        while (true) {
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println(findService.getAllMovies(allMovies));
                    break;
                case 2:
                    System.out.println("Put name of actor: " + "Angelina, Johny Depp, William, Sam Smith");
                    String name = scanner.next();
                    findService.findMovieByActorName(allMovies, name);
                    break;
                case 3:
                    findService.findMovieByDirector(allMovies, director);
                    break;
                case 5:
                    System.out.println("Put name of genre: " + "Comedy, Horror");
                    String name2 = scanner.next();
                    findService.findMovieByGenre(name2);
                    break;
                case 6:
                    System.out.println("Put year to find movie: " + "2000, 2022");
                    int num = scanner.nextInt();
                    findService.findMovieByYear(num);
                    break;
                case 7:
                    System.out.println("Put fullName or partName: " + "Angelina, Johny Depp, Zalkarbek, Elina");
                    String name22 = scanner.next();
                    findService.findMovieByFullNameOrPartName(allMovies, name22);
                    break;
                case 8:
                    System.out.println("Put role to find movie: " + "SuperStar, Killer, Driver, GirlFriend");
                    String name3 = scanner.next();
                    findService.findMovieByRole(allMovies, name3);
                    break;
                case 9:
                    System.out.println("Original order of movies"+allMovies);
                    System.out.println(sortService.sortByYear(allMovies));
                    break;
                    case 10:
                    Collections.sort(allMovies, SortService.sortByName);
                    System.out.println("Sorted name in ascending order: " + allMovies);
                        Collections.sort(allMovies, SortService.getSortByNameDescending);
                        System.out.println("In descending order: "+allMovies);
                    break;
                case 11:
                    Collections.sort(directors, SortService.sortByDirectorIndDescendingOrder);
                    System.out.println("Director in descending order: "+directors);
                    Collections.sort(directors, SortService.sortByDirector);
                    System.out.println("Director in ascending order: "+ directors);
                    break;
                case 12:
                    System.exit(0);

            }}
        }
    }
