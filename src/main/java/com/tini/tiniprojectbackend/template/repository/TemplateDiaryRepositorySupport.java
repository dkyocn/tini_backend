package com.tini.tiniprojectbackend.template.repository;

import com.tini.tiniprojectbackend.diary.enumeration.DiaryType;
import com.tini.tiniprojectbackend.template.entity.TemplateDiaryEntity;

public interface TemplateDiaryRepositorySupport {

  TemplateDiaryEntity getTemplateToDiaryId(int diaryId, DiaryType diaryType);

}
