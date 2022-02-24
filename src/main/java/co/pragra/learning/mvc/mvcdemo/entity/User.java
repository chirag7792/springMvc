package co.pragra.learning.mvc.mvcdemo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import co.pragra.learning.mvc.mvcdemo.exceptions.InvalidDataException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.regex.Pattern;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TABLE_USER")
//@JsonIgnoreProperties({ "createdBy", "lastModifiedBy" })
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
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
