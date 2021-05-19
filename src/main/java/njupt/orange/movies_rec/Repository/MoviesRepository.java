package njupt.orange.movies_rec.Repository;

import njupt.orange.movies_rec.Entity.MoviesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepository extends JpaRepository<MoviesEntity,Long> {
}
