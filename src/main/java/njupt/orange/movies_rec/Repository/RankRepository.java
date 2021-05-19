package njupt.orange.movies_rec.Repository;

import njupt.orange.movies_rec.Entity.MoviesEntity;
import njupt.orange.movies_rec.Entity.RankEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RankRepository extends JpaRepository<RankEntity,Long> {
}
