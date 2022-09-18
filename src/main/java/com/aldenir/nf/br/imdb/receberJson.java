package com.aldenir.nf.br.imdb;


import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class receberJson {

    public static void main(String[] args)  {

        Film film = new Film();
        film.searchFilmsByTile("titanic");
//        film.searchFilmsById("ls004285275");
//        System.out.println(new Gson().toJson(film.searchFilmsByTile("titanic")));
//
//        System.out.println("//----------");
//
//        System.out.println(new Gson().toJson( film.searchFilmsById("tt1043813")));

    }
}
