package njupt.orange.movies_rec.Service;

import njupt.orange.movies_rec.Entity.UserEntity;
import njupt.orange.movies_rec.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserEntity findByName(String name) {
        return userRepository.findByUserName(name);
    }
}
