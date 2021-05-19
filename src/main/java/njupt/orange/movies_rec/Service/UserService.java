package njupt.orange.movies_rec.Service;

import njupt.orange.movies_rec.Entity.UserEntity;
import njupt.orange.movies_rec.Repository.MoviesRepository;
import njupt.orange.movies_rec.Repository.RankRepository;
import njupt.orange.movies_rec.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RankRepository rankRepository;
    @Autowired
    private MoviesRepository moviesRepository;

    public UserEntity findByName(String name) {
        return userRepository.findByUserName(name);
    }
}
