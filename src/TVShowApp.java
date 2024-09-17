import java.util.List;
import java.util.ArrayList;
public class TVShowApp {
    public static void main(String[] args) {
        // Создание анонимного класса для сериалов
        TVShowInterface tvShow = new TVShowInterface() {
            String name = "Во все тяжкие";
            String status = "Завершен";
            String genre = "Драма";
            int releaseYear = 2008;

            // Список сезонов
            List<Season> seasons = new ArrayList<>();

            @Override
            public void showDetails() {
                System.out.println("Название: " + name);
                System.out.println("Статус: " + status);
                System.out.println("Жанр: " + genre);
                System.out.println("Год выхода: " + releaseYear);
            }

            @Override
            public void addSeason(Season season) {
                seasons.add(season);
                System.out.println("Добавлен сезон: " + season.getSeasonNumber());
            }
        };

        // Вывод информации о сериале
        tvShow.showDetails();

        // Создание и добавление сезонов с использованием анонимных классов
        SeasonInterface season1 = new SeasonInterface() {
            int seasonNumber = 1;
            int releaseYear = 2008;
            String description = "Начало истории Уолтера Уайта.";
            double rating = 9.0;

            @Override
            public void showSeasonDetails() {
                System.out.println("Сезон №: " + seasonNumber);
                System.out.println("Год выхода: " + releaseYear);
                System.out.println("Описание: " + description);
                System.out.println("Оценка: " + rating);
            }
        };

        // Отобразить детали сезона
        season1.showSeasonDetails();

        // Добавить сезон к сериалу
        tvShow.addSeason(new Season(1, 2008, "Начало истории Уолтера Уайта.", 9.0));
    }
}
