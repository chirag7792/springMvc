package co.pragra.learning.mvc.mvcdemo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class WorkProfile {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long profileId;
  private String companyName;
  private String jobTitle;
  private Date startDate;
  private Date endDate;
  boolean currentJob;
}
