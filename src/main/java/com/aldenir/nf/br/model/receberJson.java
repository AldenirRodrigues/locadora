package com.aldenir.nf.br.model;


import com.aldenir.nf.br.model.DescFilm;
import com.aldenir.nf.br.model.imdb.Film;

public class receberJson {

    public static void main(String[] args)  {

        com.aldenir.nf.br.model.imdb.Film film = new Film();
        film.searchFilmsByTile("titanic");

        DescFilm descFilm = new DescFilm();



//        film.searchFilmsById("ls004285275");
//        System.out.println(new Gson().toJson(film.searchFilmsByTile("titanic")));
//
//        System.out.println("//----------");
//
//        System.out.println(new Gson().toJson( film.searchFilmsById("tt1043813")));

    }
}
