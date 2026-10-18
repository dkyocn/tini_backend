package com.tini.tiniprojectbackend.template.dto;

import com.tini.tiniprojectbackend.common.dto.BaseDTO;
import com.tini.tiniprojectbackend.template.entity.TimeTrackerEntity;
import com.tini.tiniprojectbackend.template.entity.TimeTrackerItemEntity;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TimeTrackerItemDTO extends BaseDTO {

  protected int id;
  protected String category;
  protected LocalDateTime customTime;
  protected LocalDateTime targetStartTime;
  protected LocalDateTime targetEndTime;
  protected int totalTime;
  protected TimeTrackerDTO timeTracker;

  public static TimeTrackerItemDTO from(TimeTrackerItemEntity timeTrackerItemEntity) {
    return TimeTrackerItemDTO.builder()
        .id(timeTrackerItemEntity.getId())
        .category(timeTrackerItemEntity.getCategory())
        .customTime(timeTrackerItemEntity.getCustomTime())
        .targetStartTime(timeTrackerItemEntity.getTargetStartTime())
        .targetEndTime(timeTrackerItemEntity.getTargetEndTime())
        .totalTime(timeTrackerItemEntity.getTotalTime())
        .timeTracker(TimeTrackerDTO.from(timeTrackerItemEntity.getTimeTracker()))
        .createdAt(timeTrackerItemEntity.getCreatedAt())
        .updatedAt(timeTrackerItemEntity.getUpdatedAt())
        .build();
  }
}
