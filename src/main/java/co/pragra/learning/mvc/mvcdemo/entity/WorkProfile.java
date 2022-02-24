package co.pragra.learning.mvc.mvcdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TABLE_WORK_PROFILE")
public class WorkProfile {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long profileId;
  private String companyName;
  private String jobTitle;
  @Column(nullable = false, columnDefinition = "LocalDate")
  private LocalDate startDate;
  @Column(columnDefinition = "LocalDate")
  private LocalDate endDate;
  boolean currentJob;
}
