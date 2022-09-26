package com.aldenir.nf.br.controller;

import com.aldenir.nf.br.model.dto.Mapper;
import com.aldenir.nf.br.model.imdb.Film;
import com.aldenir.nf.br.model.imdb.SearchData;
import com.aldenir.nf.br.service.FilmService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
@RequestMapping("/locadora")
public class FilmController {
    @Autowired
    private FilmService service;

    @GetMapping("/catalog/{title}")
    public ResponseEntity<?> findCatalog(@PathVariable("title") String title) throws Exception {
        Mapper mapper = new Mapper();
        URI imdbuUri = URI.create("https://imdb-api.com/pt-BR/API/Search/k_giodbipb/" + title.replace(" ", "%20"));
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest requestId = HttpRequest.newBuilder().uri(imdbuUri).GET().build();
        HttpResponse response = client.send(requestId, HttpResponse.BodyHandlers.ofString());
        SearchData searchData = new Gson().fromJson(response.body().toString(), SearchData.class);

        searchData.getResults().forEach(searchResult -> {
            ResponseEntity<?> methodLinkBuilder = methodOn(FilmController.class).findById(searchResult.getId());
            Link reportLink = linkTo(methodLinkBuilder).withRel("film");
            searchResult.add(reportLink);
            mapper.getMappers().add(searchResult);
        });

        return ResponseEntity.ok(mapper);
    }

    @GetMapping("/films")
    public ResponseEntity<?> findAll() {
        Mapper mapper = new Mapper();
        service.findAll().forEach(titleData -> {
            ResponseEntity<?> methodLinkBuilder = methodOn(FilmController.class).findById(titleData.getId());
            Link reportLink = linkTo(methodLinkBuilder).withRel("film");
            titleData.add(reportLink);
            mapper.getMappers().add(titleData);
        });
        return ResponseEntity.ok(mapper);
    }

    @GetMapping("/film/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") String id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping("/film")
    public ResponseEntity<?> save(@PathVariable String id) {
        return ResponseEntity.ok(service.save(id));
    }

    @PutMapping("/film/{id}")
    public ResponseEntity<?> put(@PathVariable("id") String id) {
        return ResponseEntity.ok(service.update(id));
    }

    @DeleteMapping("/film/{id}")
    public void delete(@PathVariable("id") String id) {
        service.delete(id);
    }


}
