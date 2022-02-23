package co.pragra.learning.mvc.mvcdemo.repo;

import co.pragra.learning.mvc.mvcdemo.entity.User;
import co.pragra.learning.mvc.mvcdemo.entity.WorkProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkProfileRepo extends JpaRepository<WorkProfile,Long> {

}
