package uns.movies.movies.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uns.movies.movies.domain.Film;

@Repository
public interface FilmsRepository extends JpaRepository<Film, Long> {
}
