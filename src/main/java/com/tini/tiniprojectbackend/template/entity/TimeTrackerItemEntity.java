package com.tini.tiniprojectbackend.template.entity;

import com.tini.tiniprojectbackend.common.entity.BaseEntity;
import com.tini.tiniprojectbackend.template.dto.TimeTrackerDTO;
import com.tini.tiniprojectbackend.template.dto.TimeTrackerItemDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "TB_TT_ITEM")
public class TimeTrackerItemEntity extends BaseEntity {

  @Id
  @Column(name = "ID")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(name = "CATEGORY")
  private String category;
  @Column(name = "CUSTOM_TIME")
  private LocalDateTime customTime;
  @Column(name = "TARGET_START_TIME")
  private LocalDateTime targetStartTime;
  @Column(name = "TARGET_END_TIME")
  private LocalDateTime targetEndTime;
  @Column(name = "TOTAL_TIME")
  private int totalTime;
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "TIME_TRACKER_ID")
  private TimeTrackerEntity timeTracker;

  @Builder(builderMethodName = "createTimeTrackerItemBuilder", builderClassName = "createTimeTrackerItemBuilder")
  public TimeTrackerItemEntity(TimeTrackerItemDTO timeTrackerItemDTO) {
    this.category = timeTrackerItemDTO.getCategory();
    this.targetStartTime = timeTrackerItemDTO.getTargetStartTime();
    this.targetEndTime = timeTrackerItemDTO.getTargetEndTime();
  }

  public void updateTimeTrackerItem(TimeTrackerItemDTO timeTrackerItemDTO) {
    this.targetStartTime = timeTrackerItemDTO.getTargetStartTime();
    this.targetEndTime = timeTrackerItemDTO.getTargetEndTime();
  }

  public void updateTotalTime(int totalTime) {
    this.totalTime = totalTime;
  }
}
