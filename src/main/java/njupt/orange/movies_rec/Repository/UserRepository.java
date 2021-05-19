package njupt.orange.movies_rec.Repository;

import njupt.orange.movies_rec.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
    UserEntity findByUserId(String userID);
    UserEntity findByUserName(String userName);
}
