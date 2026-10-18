package com.tini.tiniprojectbackend.template.controller;

import com.tini.tiniprojectbackend.diary.enumeration.DiaryType;
import com.tini.tiniprojectbackend.template.dto.TemplateCommonDTO;
import com.tini.tiniprojectbackend.template.dto.TemplateDiaryDTO;
import com.tini.tiniprojectbackend.template.service.CommonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/tini/common")
public class CommonController {

  private final CommonService commonService;

  // 다이어리 템플릿 조회
  @GetMapping
  public ResponseEntity<TemplateDiaryDTO> getTemplateToDiaryId(@RequestParam int diaryId, @RequestParam
      DiaryType diaryType) {
    return new ResponseEntity<>(commonService.getTemplateToDiaryId(diaryId,diaryType), HttpStatus.OK);
  }
}
