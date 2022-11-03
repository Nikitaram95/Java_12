package ru.netology.manager;

public class Manager {
    private String[] movies = new String[0];
    private int limit;

    public Manager() {

    }

    public String[] findAll() {
        return movies;

    }

    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }


    public String[] findLast() {
        String[] result = new String[limit = 10];
        for (int i = 0; i < limit; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }


}

