package com.tini.tiniprojectbackend.template.dto;

import com.tini.tiniprojectbackend.common.dto.BaseDTO;
import com.tini.tiniprojectbackend.template.entity.MonthlyItemEntity;
import com.tini.tiniprojectbackend.template.entity.TemplateCommonEntity;
import java.time.LocalDateTime;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MonthlyItemDTO extends BaseDTO {

  protected int id;
  protected int timeCount;
  protected String category;
  protected LocalDateTime customTime;
  protected TemplateCommonDTO templateCommon;

  public static MonthlyItemDTO from(MonthlyItemEntity monthlyItemEntity) {
    return MonthlyItemDTO.builder()
        .id(monthlyItemEntity.getId())
        .timeCount(monthlyItemEntity.getTimeCount())
        .category(monthlyItemEntity.getCategory())
        .customTime(monthlyItemEntity.getCustomTime())
        .templateCommon(TemplateCommonDTO.from(monthlyItemEntity.getTemplateCommon()))
        .updatedAt(monthlyItemEntity.getUpdatedAt())
        .createdAt(monthlyItemEntity.getCreatedAt())
        .build();
  }
}
