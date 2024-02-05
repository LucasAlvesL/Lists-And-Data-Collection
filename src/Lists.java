import java.util.ArrayList;
import java.util.Collections;

public class Lists {
    public static void main(String[] args) {
        Titles movie1 = new Titles("TopGun", 2022, 127);
        Titles movie2 = new Titles("Mission: Impossible", 2023, 127);
        Titles movie3 = new Titles("Jack Reacher", 2012, 120);

        ArrayList<Titles> movieList = new ArrayList<>();
        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);

        for (Titles item: movieList) {
            System.out.println(item.getName());
        }

        ArrayList<String> searchActors = new ArrayList<>();
        searchActors.add("Adam Sandler");
        searchActors.add("Tom Cruise");
        searchActors.add("Leonardo Di Caprio");
        // Before ordenation
        System.out.println(searchActors);

        // After ordenation
        Collections.sort(searchActors);
        System.out.println(searchActors);
    }
}
