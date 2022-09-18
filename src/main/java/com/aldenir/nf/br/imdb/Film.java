package com.aldenir.nf.br.imdb;

import com.aldenir.nf.br.imdb.desc.TitleData;
import com.google.gson.Gson;
import lombok.Getter;
import lombok.Setter;
import lombok.SneakyThrows;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class Film {

    @SneakyThrows
    public SearchData searchFilmsByTile(String title) {

        String apiKey = "k_giodbipb";
        URI imdbuUri = URI.create("https://imdb-api.com/pt-BR/API/Search/k_giodbipb/" + title.replace(" ", "%20"));
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest requestId = HttpRequest.newBuilder().uri(imdbuUri).GET().build();
        HttpResponse response = null;
        response = client.send(requestId, HttpResponse.BodyHandlers.ofString());
        SearchData searchData = new Gson().fromJson(response.body().toString(), SearchData.class);
        searchData.results.forEach(searchResult -> {
            searchFilmsById(searchResult.getId());
        });
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
        System.out.println(json);
        return new Gson().fromJson(json, TitleData.class);

    }
}
