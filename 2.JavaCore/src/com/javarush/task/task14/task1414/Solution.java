package com.javarush.task.task14.task1414;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

/* 
MovieFactory
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Movie movie = null;
        String key = null;
        List<String> keys = Arrays.asList("cartoon", "thriller", "soapOpera");
        key = reader.readLine();
        while (keys.contains(key)) {
            movie = MovieFactory.getMovie(key);
            System.out.println(movie.getClass().getSimpleName());
            key = reader.readLine();
        }
        movie = MovieFactory.getMovie(key);
        reader.close();
    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }
            else if ("thriller".equals(key)) {
                movie = new Thriller();
            }
            else if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }
            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {
    }

    static class Thriller extends Movie {
    }
}
