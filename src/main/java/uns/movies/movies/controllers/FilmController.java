package uns.movies.movies.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uns.movies.movies.domain.Film;
import uns.movies.movies.repositories.FilmsRepository;

import java.util.List;

@RestController
@RequestMapping("/api/films")
public class FilmController {
    @Autowired
    private FilmsRepository filmsRepository;

    @PostMapping
    public ResponseEntity<Film> create(@RequestBody Film film) {
        Film saved_film = filmsRepository.save(film);
        return ResponseEntity.ok(saved_film);
    }

    @GetMapping
    public ResponseEntity<List<Film>> getAll() {
        return new ResponseEntity<>(filmsRepository.findAll(), HttpStatus.OK );
    }
}

