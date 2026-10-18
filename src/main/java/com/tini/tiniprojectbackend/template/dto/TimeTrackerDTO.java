package com.tini.tiniprojectbackend.template.dto;

import com.tini.tiniprojectbackend.common.dto.BaseDTO;
import com.tini.tiniprojectbackend.template.entity.TimeTrackerEntity;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TimeTrackerDTO extends BaseDTO {

  protected int id;
  protected String title;
  protected LocalDateTime targetStartTime;
  protected LocalDateTime targetEndTime;
  protected List<TimeTrackerItemDTO>  timeTrackerItems;

  public static TimeTrackerDTO from(TimeTrackerEntity timeTrackerEntity) {
    return TimeTrackerDTO.builder()
        .id(timeTrackerEntity.getId())
        .title(timeTrackerEntity.getTitle())
        .targetStartTime(timeTrackerEntity.getTargetStartTime())
        .targetEndTime(timeTrackerEntity.getTargetEndTime())
        .timeTrackerItems(timeTrackerEntity.getTimeTrackerItemEntities().stream().map(TimeTrackerItemDTO::from).collect(
            Collectors.toList()))
        .updatedAt(timeTrackerEntity.getUpdatedAt())
        .createdAt(timeTrackerEntity.getCreatedAt())
        .build();
  }
}
