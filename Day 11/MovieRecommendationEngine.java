import java.util.*;
public class MovieRecommendationEngine {
    static class Movie { String title; double rating; Movie(String title, double rating) { this.title = title; this.rating = rating; } }
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>(); movies.add(new Movie("Drama", 8.1)); movies.add(new Movie("Comedy", 7.4)); movies.add(new Movie("Action", 8.8));
        movies.sort(Comparator.comparingDouble((Movie m) -> m.rating).reversed()); for (Movie m : movies) System.out.println(m.title + " rating " + m.rating);
    }
}
