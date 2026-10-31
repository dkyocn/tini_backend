package com.tini.tiniprojectbackend.template.service;

import com.tini.tiniprojectbackend.diary.enumeration.DiaryType;
import com.tini.tiniprojectbackend.template.dto.TemplateCommonDTO;
import com.tini.tiniprojectbackend.template.dto.TemplateDiaryDTO;
import com.tini.tiniprojectbackend.template.entity.TemplateDiaryEntity;
import com.tini.tiniprojectbackend.template.repository.TemplateDiaryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@RequiredArgsConstructor
public class CommonService {

  private final TemplateDiaryRepository templateDiaryRepository;

  /**
   * 다이어리 ID, 템플릿 TYPE으로 템플릿 조회
   * @param diaryId 다이어리 ID
   * @param diaryType 다이어리 TYPE
   * @return
   */
  public TemplateDiaryDTO getTemplateToDiaryId(int diaryId, DiaryType diaryType) {
    TemplateDiaryEntity templateToDiaryId = templateDiaryRepository.getTemplateToDiaryId(diaryId,diaryType);

    return TemplateDiaryDTO.from(templateToDiaryId);
  }

  // 오늘의 트래킹에서 사용할 한 다이어리의 총 템플릿만 조회
}
