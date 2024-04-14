package uns.movies.movies.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "sv_56_2021")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String title;
    public String genre;
    public Long year;
}
