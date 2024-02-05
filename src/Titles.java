public class Titles {
    private String name;
    private int releaseYear;
    private int durationInMinutes;

    // Constructor
    public Titles(String name, int releaseYear, int durationInMinutes) {
        this.setName(name);
        this.setReleaseYear(releaseYear);
        this.setDurationInMinutes(durationInMinutes);
    }

    // Getters
    public String getName(){
        return name;
    }
    public int getReleaseYear(){
        return releaseYear;
    }
    public int getDurationInMinutes(){
        return durationInMinutes;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }
    public void setReleaseYear(int releaseYear){
        this.releaseYear = releaseYear;
    }
    public void setDurationInMinutes(int durationInMinutes){
        this.durationInMinutes = durationInMinutes;
    }

    public void displayData(){
        System.out.println("Movie name: " + this.name);
        System.out.println("Release Year: " + this.releaseYear);
        System.out.println("Movie Duration: " + this.durationInMinutes);
    }

    @Override
    public String toString(){
        return "Movie: " + this.getName() + " (" + this.getReleaseYear() + ")";
    }
}
