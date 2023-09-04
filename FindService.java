import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;

public class FindService implements Findable {

    private LinkedList<Movie> movies;

    public FindService(LinkedList<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        Iterator<Movie> iterator = movies.iterator();
        while (iterator.hasNext()) {
            Movie movie = iterator.next();
        }
        return movies;
    }


    @Override
    public void findMovieByFullNameOrPartName(List<Movie> movies, String fullName) {
        for(Movie mm:movies){
            LinkedList<Cast>castLinkedList=(LinkedList<Cast>)mm.getCast();
            for (Cast cast:castLinkedList){
                if (cast.getActorFullName().contains(fullName)) {
                    System.out.println(mm);
                    break; // This should
                }
            }
        }
    }




    @Override
    public void findMovieByYear( int year) {
        for (Movie movie : movies) {
            if (movie.getYear() == year) {
                System.out.println(movie);
                break;
            }
        }
    }



    @Override
    public void findMovieByActorName(List<Movie> movies, String actorName) {
        for (Movie movie : movies) {
                LinkedList<Cast> casts = (LinkedList<Cast>) movie.getCast();
                for (Cast cast : casts) {
                    if (cast.getActorFullName().contains(actorName)) {
                        System.out.println(movie);
                    }
                }
            }
        }






    @Override
    public void findMovieByDirector(List<Movie> movies, Director director) {
        for(Movie movie:movies){
            if(movie.getDirector().equals(director)){
                System.out.println(movie);
                break;
            }
        }
    }

    @Override
    public void findMovieByGenre( String genreName) {
        for (Movie movie : movies) {
            if (movie.getGenre().contains(genreName)) {
                System.out.println(movie);
                break; // This should be inside the if block to exit the loop when a matching movie is found.
            }
        }
    }
    @Override
    public void findMovieByRole(List<Movie> movies, String role) {
        for (Movie movie:movies){
            LinkedList<Cast>casts=(LinkedList<Cast>)movie.getCast();
            for(Cast cast:casts){
                if(cast.getRole().contains(role)){
                    System.out.println(movie);
                    break;
                }
            }
        }
    }
}
