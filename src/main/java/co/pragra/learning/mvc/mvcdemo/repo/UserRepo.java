package co.pragra.learning.mvc.mvcdemo.repo;

import co.pragra.learning.mvc.mvcdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {

 public User createUser();

}
