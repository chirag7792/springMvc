package co.pragra.learning.mvc.mvcdemo.service;

import co.pragra.learning.mvc.mvcdemo.entity.User;
import co.pragra.learning.mvc.mvcdemo.repo.UserRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public UserRepo repo;

    public UserService(UserRepo repo) {
        this.repo = repo;
    }
    public User createUser(User user){
        return repo.save(user);
    }
    public User  getUserById(Long id){
        return repo.getById(id);
    }

}

