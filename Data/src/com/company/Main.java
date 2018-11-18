package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);

        Movies The_Green_Mile = new Movies("Зеленая миля", "Фрэнк Дарабонт", "Том Хенкс", 1999, 9, 80);
        Movies Oceans_Eleven = new Movies("Одиннадцать друзей Оушена", "Стивен Содерберг", "Джордж Клуни", 2001, 8.1, 82);
        Movies The_Shawshank_Redemption = new Movies("Побег из Шоушенка", "Фрэнк Дарабонт", "Морган Фриман", 1994, 9.5, 91);
        Movies Intouchables = new Movies("1+1", "Оливье Накаш, Эрик Толедано", "Омар Си", 2011, 9, 75);
        Movies Back_to_the_Future = new Movies("Назад в будущее", "Роберт Земекис", "Майкл Дж. Фокс", 1985, 9, 96);
        Movies Catch_Me_If_You_Can = new Movies("Поймай меня, если сможешь", "Стивен Спилберг", "Леонардо ДиКаприо", 2002, 9, 96);
        Movies The_Pursuit_of_Happyness = new Movies("В погоне за счастьем", "Габриэле Муччино", "Уилл Смит", 2006, 8.5, 67);
        Movies Titanic = new Movies("Титаник", "Джеймс Кэмерон", "Леонардо ДиКаприо", 1997, 9.5, 97);
        Movies Avatar = new Movies("Аватар", "Джеймс Кэмерон", "Сэм Уортингтон", 2009, 9.9, 98);
        Movies Avengers_Infinity_War = new Movies("Мстители: Война бесконечности", "Энтони Руссо, Джо Руссо", "Роберт Дауни мл.", 2018, 9.7, 97);
        Movies Black_Panther = new Movies("Чёрная Пантера", "Райан Куглер", "Чедвик Боузман", 2018, 9.8, 97);
        Movies The_Dark_Knight_Rises = new Movies("Тёмный рыцарь: Возрождение легенды", "Кристофер Нолан", "Кристиан Бейл", 2012, 8.8, 87);
        Movies Guardians_of_the_Galaxy_Vol_2 = new Movies("Стражи Галактики. Часть 2", "Джеймс Ганн", "Крис Пратт", 2017, 9, 95);
        Movies Skyfall = new Movies("Скайфолл", "Сэм Мендес", "Дэниел Крэйг", 2012, 8.4, 83);
        Movies Captain_America_Civil_War = new Movies("Первый мститель: Противостояние", "Энтони Руссо, Джо Руссо", "Крис Эванс", 2016, 8.7, 92);
        Movies Thor_Ragnarok = new Movies("Тор: Рагнарёк", "Тайка Вайтити", "Крис Хемсворт", 2017, 9, 96);
        Movies The_Deathly_Hallows_2 = new Movies("Гарри Поттер и Дары Смерти 2.", "Дэвид Йейтс", "Дэниел Рэдклифф", 2011, 8.6, 95);
        Movies The_Conjuring = new Movies("Заклятие", "Джеймс Ван", "Вера Фармига", 2013, 9.7, 95);

        System.out.println("Вывести названия фильмов, вышедших на экран за последние 3 года");
        Avengers_Infinity_War.getInfoMovies();
        Black_Panther.getInfoMovies();
        Guardians_of_the_Galaxy_Vol_2.getInfoMovies();
        Captain_America_Civil_War.getInfoMovies();
        Thor_Ragnarok.getInfoMovies();
        System.out.println("Вывести названия всех фильмов, в которых снимался данный актёр :");
        String act = name.nextLine();
        if (act.equals("Том Хенкс")) {
            The_Green_Mile.getInfoMovies();
        }
        else if (act.equals("Джордж Клуни")) {
            Oceans_Eleven.getInfoMovies();
        }
        else if (act.equals("Морган Фриман")) {
            The_Shawshank_Redemption.getInfoMovies();
        }
        else if (act.equals("Омар Си")) {
            Intouchables.getInfoMovies();
        }
        else if (act.equals("Майкл Дж. Фокс")) {
            Back_to_the_Future.getInfoMovies();
        }
        else if (act.equals("Леонардо ДиКаприо")) {
            Catch_Me_If_You_Can.getInfoMovies();
            Titanic.getInfoMovies();
        }
        else if (act.equals("Уилл Смит")) {
            The_Pursuit_of_Happyness.getInfoMovies();
        }
        else if (act.equals("Сэм Уортингтон")) {
            Avatar.getInfoMovies();
        }
        else if (act.equals("Роберт Дауни мл.")) {
            Avengers_Infinity_War.getInfoMovies();
        }
        else if (act.equals("Чедвик Боузман")) {
            Black_Panther.getInfoMovies();
        }
        else if (act.equals("Кристиан Бейл")) {
            The_Dark_Knight_Rises.getInfoMovies();
        }
        else if (act.equals("Крис Пратт")) {
            Guardians_of_the_Galaxy_Vol_2.getInfoMovies();
        }
        else if (act.equals("Дэниел Крэйг")) {
            Skyfall.getInfoMovies();
        }
        else if (act.equals("Крис Эванс")) {
            Captain_America_Civil_War.getInfoMovies();
        }
        else if (act.equals("Крис Хемсворт")) {
            Thor_Ragnarok.getInfoMovies();
        }
        else if (act.equals("Дэниел Рэдклифф" )) {
            The_Deathly_Hallows_2.getInfoMovies();
        }
        else if (act.equals("Вера Фармига")) {
            The_Conjuring.getInfoMovies();
        }
        else {
            System.out.println("Актера нет в базе");
        }
        System.out.println("Изменить рейтинг фильма:");
        System.out.println("Введите название фильма :");
        String fil = name.nextLine ();
        System.out.println("Установите новый рейтинг фильму :");
        double rat = name.nextDouble ();


        if (fil.equals("Зеленая миля")) {
            The_Green_Mile.getNewRating(rat);
        }
        else if (fil.equals("Одиннадцать друзей Оушена")) {
            Oceans_Eleven.getNewRating(rat);
        }
        else if (fil.equals("Побег из Шоушенка")) {
            The_Shawshank_Redemption.getNewRating(rat);
        }
        else if (fil.equals("1+1")) {
            Intouchables.getNewRating(rat);
        }
        else if (fil.equals("Назад в будущее")) {
            Back_to_the_Future.getNewRating(rat);
        }
        else if (fil.equals("Поймай меня, если сможешь")) {
            Catch_Me_If_You_Can.getNewRating(rat);
        }
        else if (fil.equals("В погоне за счастьем")) {
            The_Pursuit_of_Happyness.getNewRating(rat);
        }
        else if (fil.equals("Титаник")) {
            Titanic.getNewRating(rat);
        }
        else if (fil.equals("Аватар")) {
            Avatar.getNewRating(rat);
        }
        else if (fil.equals("Мстители: Война бесконечности")) {
            Avengers_Infinity_War.getNewRating(rat);
        }
        else if (fil.equals("Чёрная Пантера")) {
            Black_Panther.getNewRating(rat);
        }
        else if (fil.equals("Тёмный рыцарь: Возрождение легенды")) {
            The_Dark_Knight_Rises.getNewRating(rat);
        }
        else if (fil.equals("Стражи Галактики. Часть 2")) {
            Guardians_of_the_Galaxy_Vol_2.getNewRating(rat);
        }
        else if (fil.equals("Скайфолл")) {
            Skyfall.getNewRating(rat);
        }
        else if (fil.equals("Первый мститель: Противостояние")) {
            Captain_America_Civil_War.getNewRating(rat);
        }
        else if (fil.equals("Тор: Рагнарёк")) {
            Thor_Ragnarok.getNewRating(rat);
        }
        else if (fil.equals("Гарри Поттер и Дары Смерти 2." )) {
            The_Deathly_Hallows_2.getNewRating(rat);
        }
        else if (fil.equals("Заклятие")) {
            The_Conjuring.getNewRating(rat);
        }
        else {
            System.out.println("Фильма  нет в базе");
        }




    }
}
