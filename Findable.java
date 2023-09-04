import java.util.List;

public interface Findable {

    List<Movie> getAllMovies(List<Movie>movies);

    void findMovieByFullNameOrPartName(List<Movie>movies, String fullName);

    void findMovieByActorName(List<Movie>movies, String actorName);

    void findMovieByYear( int year);

    void findMovieByDirector(List<Movie>movies, Director director);

    void findMovieByGenre(String genre);

    void findMovieByRole(List<Movie>movies, String role);
}
