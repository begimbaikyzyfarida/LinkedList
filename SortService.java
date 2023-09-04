import java.util.*;

public class SortService implements Sortable {


    private LinkedList<Movie>movies;


    public SortService(LinkedList<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public List<Movie> sortByYear(List<Movie> movies) {
        boolean ascending=true;
        Comparator<Movie> yearComparator = Comparator.comparingInt(Movie::getYear);

        if (!ascending) {
            yearComparator = yearComparator.reversed();
        }

        List<Movie> sortedMovies = new ArrayList<>(movies);
        Collections.sort(sortedMovies, yearComparator);
        return sortedMovies;
    }




    public static Comparator<Movie> sortByName = new Comparator<Movie>() {

            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

    public static Comparator<Movie> getSortByNameDescending=new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.getName().compareTo(o1.getName());
        }

    };

    public static Comparator<Director> sortByDirector=new Comparator<Director>() {

        @Override
        public int compare(Director o1, Director o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static Comparator<Director> sortByDirectorIndDescendingOrder=new Comparator<Director>() {

        @Override
        public int compare(Director o1, Director o2) {
            return o2.getName().compareTo(o1.getName());
        }
    };


        @Override
    public String toString() {
        return "SortService{" +
                "movies=" + movies +
                '}';
    }


}
