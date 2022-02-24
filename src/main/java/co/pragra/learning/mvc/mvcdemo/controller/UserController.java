package co.pragra.learning.mvc.mvcdemo.controller;

import co.pragra.learning.mvc.mvcdemo.entity.User;
import co.pragra.learning.mvc.mvcdemo.exceptions.InvalidDataException;
import co.pragra.learning.mvc.mvcdemo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController{
    public UserService service;

    private UserController(UserService service){
        this.service=service;
    }

    @PostMapping(value = "/api/user", produces = MediaType.APPLICATION_JSON_VALUE)
    public User update(@RequestBody User user) throws InvalidDataException {
        return service.createUser(user);
    }

//    @GetMapping(value ="/api/user/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
//    public User getAllUsers(@RequestBody ){
//        return service.getUserById();
//    }
    @GetMapping(value = "/api/user/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getUser(@PathVariable Long id) throws InvalidDataException {
        System.out.println("Got id" + id);
        return ResponseEntity.ok(service.getUserById(id));
    }
    @GetMapping(value = "/api/user/all",
    produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> getAllUsers(){
        return  ResponseEntity.ok(service.getAll());
    }

}
