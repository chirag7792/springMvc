package co.pragra.learning.mvc.mvcdemo.controller;

import co.pragra.learning.mvc.mvcdemo.entity.User;
import co.pragra.learning.mvc.mvcdemo.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController{
    private UserService service;

    private UserController(UserService service){
        this.service=service;
    }

    @PostMapping(value = "/api/user", produces = MediaType.APPLICATION_JSON_VALUE)
    public User update(@RequestBody User user){
        return service.createUser(user);
    }

}
