package school.hei.news.heinews.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import school.hei.news.heinews.model.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // pour ecrire soi meme ses propres requêtes utilisez JPQL.
    List<User> findByFirstNameStartingWith(String wanted);
}
