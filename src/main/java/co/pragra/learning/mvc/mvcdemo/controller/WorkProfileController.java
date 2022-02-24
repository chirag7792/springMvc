package co.pragra.learning.mvc.mvcdemo.controller;

import co.pragra.learning.mvc.mvcdemo.entity.User;
import co.pragra.learning.mvc.mvcdemo.entity.WorkProfile;
import co.pragra.learning.mvc.mvcdemo.service.UserService;
import co.pragra.learning.mvc.mvcdemo.service.WorkProfileService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WorkProfileController {
    private WorkProfileService service;

    public WorkProfileController(WorkProfileService service){
        this.service=service;
    }

    @PostMapping(value = "/api/workprofile", produces = MediaType.APPLICATION_JSON_VALUE)
    public WorkProfile create(@RequestBody WorkProfile profile){
        return service.createWorkProfile(profile);
    }
    @GetMapping(value = "/api/workprofiles",
    produces = MediaType.APPLICATION_JSON_VALUE)
    public List<WorkProfile> getAllProfiles(){
        return service.getAll();
    }


}
