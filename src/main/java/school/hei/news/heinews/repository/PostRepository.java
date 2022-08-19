package school.hei.news.heinews.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import school.hei.news.heinews.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
