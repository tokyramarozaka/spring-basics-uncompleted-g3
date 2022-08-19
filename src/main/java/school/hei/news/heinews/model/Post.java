package school.hei.news.heinews.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    private LocalDate postingDate;

    @Transient // ne pas persister dans la base
    // mais le garder dans l'objet JAVA.
    private int totalLikes;

    @ManyToOne
    private User user;
}
