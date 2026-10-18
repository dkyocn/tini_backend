package com.tini.tiniprojectbackend.template.dto;

import com.tini.tiniprojectbackend.common.dto.BaseDTO;
import com.tini.tiniprojectbackend.template.entity.TemplateCommonEntity;
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
public class TemplateCommonDTO extends BaseDTO {

  protected int id;
  protected String title;
  protected List<TemplateDiaryDTO> templateDiaryDTOS;
  protected List<MonthlyItemDTO> monthlyItemDTOS;
  protected List<PointDTO> pointDTOS;
  // 가계부

  public static TemplateCommonDTO from(TemplateCommonEntity templateCommonEntity) {
    return TemplateCommonDTO.builder()
        .id(templateCommonEntity.getId())
        .title(templateCommonEntity.getTitle())
        .monthlyItemDTOS(templateCommonEntity.getMonthlyItemEntities().stream().map(MonthlyItemDTO::from).collect(Collectors.toList()))
        .pointDTOS(templateCommonEntity.getPointEntities().stream().map(PointDTO::from).collect(Collectors.toList()))
        .updatedAt(templateCommonEntity.getUpdatedAt())
        .createdAt(templateCommonEntity.getCreatedAt())
        .build();
  }
}
