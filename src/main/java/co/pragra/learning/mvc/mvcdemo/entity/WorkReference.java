package co.pragra.learning.mvc.mvcdemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WorkReference {
    @Id
    private String id;
    private String superVisorName;
    private String superVisorPhone;
    private String superVisorEmail;
}
