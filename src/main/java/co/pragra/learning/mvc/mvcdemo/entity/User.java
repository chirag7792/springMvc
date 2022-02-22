package co.pragra.learning.mvc.mvcdemo.entity;

import lombok.Data;
import sun.plugin.util.UserProfile;

import javax.persistence.*;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;
    private String firstName;
    private String lastName;
    @Column(unique = true, nullable = false)
    private String phoneNumber;
    @Column(unique = true, nullable = false)
    private String email;

    @OneToOne
    @JoinColumn(name = "profile_id")
    private WorkProfile profile;

}
