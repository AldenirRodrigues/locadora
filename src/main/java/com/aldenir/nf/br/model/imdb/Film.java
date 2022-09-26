package com.aldenir.nf.br.model.imdb;

import com.google.gson.Gson;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

//@RestController
//@RequestMapping
public class Film {

    @SneakyThrows
    public SearchData searchFilmsByTile(String title) {

        String apiKey = "k_giodbipb";
        URI imdbuUri = URI.create("https://imdb-api.com/pt-BR/API/Search/k_giodbipb/" + title.replace(" ", "%20"));
//        URI imdbuUri = URI.create("https://imdb-api.com/pt-BR/API/Search/k_giodbipb/" + title.replace(" ", "%20"));
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest requestId = HttpRequest.newBuilder().uri(imdbuUri).GET().build();
        HttpResponse response = client.send(requestId, HttpResponse.BodyHandlers.ofString());
//        SearchData searchData = new Gson().fromJson(response.body().toString(), SearchData.class);
//        searchData.results.forEach(searchResult -> {
//            searchFilmsById(searchResult.getId());
//        });
//        System.out.println(new Gson().toJson(searchData));
        return new Gson().fromJson(response.body().toString(), SearchData.class);
    }

    @SneakyThrows
    public TitleData searchFilmsById(String id) {

        String apiKey = "k_giodbipb";
        URI imdbuUri = URI.create("https://imdb-api.com/pt-BR/API/Title/k_giodbipb/" + id);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest requestDesc = HttpRequest.newBuilder().uri(imdbuUri).GET().build();
        HttpResponse response = client.send(requestDesc, HttpResponse.BodyHandlers.ofString());
        String json = response.body().toString();
//        descFilm(new Gson().fromJson(json, TitleData.class));
//        System.out.println(json);
//        System.out.println(new Gson().fromJson(json, TitleData.class));
        return new Gson().fromJson(json, TitleData.class);
    }
//    public DescFilm descFilm(TitleData titleData){
//
//        DescFilm descFilm = new DescFilm();
//        descFilm.
//
//    }
}
