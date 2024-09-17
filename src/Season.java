public class Season {
    private int seasonNumber;
    private int releaseYear;
    private String description;
    private double rating;

    public Season(int seasonNumber, int releaseYear, String description, double rating) {
        this.seasonNumber = seasonNumber;
        this.releaseYear = releaseYear;
        this.description = description;
        this.rating = rating;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void showSeasonDetails() {
        System.out.println("Сезон №: " + seasonNumber);
        System.out.println("Год выхода: " + releaseYear);
        System.out.println("Описание: " + description);
        System.out.println("Оценка: " + rating);
    }
}
