package com.tini.tiniprojectbackend.template.dto;

import com.tini.tiniprojectbackend.common.dto.BaseDTO;
import com.tini.tiniprojectbackend.template.entity.PointEntity;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PointDTO extends BaseDTO {

  protected int id;
  protected int score;
  protected String category;
  protected LocalDateTime customTime;
  protected TemplateCommonDTO templateCommon;

  public static PointDTO from(PointEntity pointEntity) {
    return PointDTO.builder()
        .id(pointEntity.getId())
        .score(pointEntity.getScore())
        .category(pointEntity.getCategory())
        .customTime(pointEntity.getCustomTime())
        .templateCommon(TemplateCommonDTO.from(pointEntity.getTemplateCommon()))
        .updatedAt(pointEntity.getUpdatedAt())
        .createdAt(pointEntity.getCreatedAt())
        .build();

  }

}
