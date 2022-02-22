package co.pragra.learning.mvc.mvcdemo.service;

import co.pragra.learning.mvc.mvcdemo.entity.User;
import co.pragra.learning.mvc.mvcdemo.repo.UserRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserRepo repo;

    public UserService(UserRepo repo) {
        this.repo = repo;
    }
    public User createUser(User user){
        return repo.save(user);
    }
}

