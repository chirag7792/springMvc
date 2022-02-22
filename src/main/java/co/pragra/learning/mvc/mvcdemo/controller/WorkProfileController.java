package co.pragra.learning.mvc.mvcdemo.controller;

import co.pragra.learning.mvc.mvcdemo.entity.User;
import co.pragra.learning.mvc.mvcdemo.entity.WorkProfile;
import co.pragra.learning.mvc.mvcdemo.service.UserService;
import co.pragra.learning.mvc.mvcdemo.service.WorkProfileService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class WorkProfileController {
    private WorkProfileService service;

    public WorkProfileController(WorkProfileService service){
        this.service=service;
    }

    @PostMapping(value = "/api/workprofile", produces = MediaType.APPLICATION_JSON_VALUE)
    public WorkProfile create(@RequestBody WorkProfile profile){
        return service.createWorkProfile(profile);
    }


}
