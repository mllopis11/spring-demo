package mike.demo.redis.module.user.service;

import org.springframework.stereotype.Service;

import mike.demo.redis.module.user.model.UserSession;
import mike.demo.redis.module.user.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;
    
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public UserSession create() {
        UserSession session = new UserSession();
        return this.userRepository.save(session);
    }
}
