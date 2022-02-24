package co.pragra.learning.mvc.mvcdemo.service;

import co.pragra.learning.mvc.mvcdemo.entity.User;
import co.pragra.learning.mvc.mvcdemo.repo.UserRepo;
import co.pragra.learning.mvc.mvcdemo.exceptions.InvalidDataException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

@Service
public class UserService {

    public UserRepo repo;

    public UserService(UserRepo repo) {
        this.repo = repo;
    }
    public User createUser(User user) throws InvalidDataException {
        validateId(user.getUserId());
        validateEmail(user.getEmail());
        validateFName(user.getFirstName());
        validateLName(user.getLastName());
        validatePhone(user.getPhoneNumber());
        return repo.save(user);
    }
    public User getUserById(Long id) throws InvalidDataException {
        validateId(id);
        Optional<User> byId = repo.findById(id);
        return byId.orElseThrow(()->new RuntimeException("No data found for id" + id));
    }
    public List<User> getAll(){
        return repo.findAll();
    }
    public void validateId(Long id) throws InvalidDataException {
        if(id == null || id<0){
            throw new InvalidDataException("ID NOT VALID");
        }
    }
    public void validatePhone(String phoneNumber){
        if(phoneNumber.isEmpty()){
            throw new RuntimeException("Phone number cannot be null");
        }
        if(phoneNumber.startsWith("0")){
            throw new RuntimeException("0 is invalid country code");
        }
        if(phoneNumber.length()!=10){
            throw new RuntimeException("phone number is not a valid number it should have 10 digits");
        }
        if(!phoneNumber.matches("\\d")){
            throw new RuntimeException(" Not valid number phone number");
        }
    }
    public void validateEmail(String email) throws InvalidDataException {
        String regex = "^(.+)@(.+)$";
        boolean matches = Pattern.compile(regex).matcher(email).matches();
        if(email.equals("") && matches==false){
            throw new InvalidDataException("email not a valid email address");
        }

    }
    public void validateFName(String firstName) throws InvalidDataException {
        if(firstName.isEmpty()){
            throw new InvalidDataException("First Name cannot be null");
        }
    }
    public void validateLName(String lastName) throws InvalidDataException {
        if(lastName.isEmpty()){
            throw new InvalidDataException("Last Name cannot be null");
        }
    }

}

