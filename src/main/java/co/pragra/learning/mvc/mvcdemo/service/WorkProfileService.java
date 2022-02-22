package co.pragra.learning.mvc.mvcdemo.service;

import co.pragra.learning.mvc.mvcdemo.entity.User;
import co.pragra.learning.mvc.mvcdemo.entity.WorkProfile;
import co.pragra.learning.mvc.mvcdemo.repo.UserRepo;
import co.pragra.learning.mvc.mvcdemo.repo.WorkProfileRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkProfileService {

    public WorkProfileRepo repo;

    public WorkProfileService(WorkProfileRepo repo) {
        this.repo = repo;
    }


    public WorkProfile createWorkProfile(WorkProfile profile){

        return repo.save(profile);

    }

}
