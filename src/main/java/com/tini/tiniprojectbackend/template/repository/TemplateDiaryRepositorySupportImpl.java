package com.tini.tiniprojectbackend.template.repository;

import static com.tini.tiniprojectbackend.template.entity.QTemplateDiaryEntity.templateDiaryEntity;

import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.tini.tiniprojectbackend.common.exception.TiniErrorCode;
import com.tini.tiniprojectbackend.common.exception.TiniException;
import com.tini.tiniprojectbackend.diary.enumeration.DiaryType;
import com.tini.tiniprojectbackend.template.entity.TemplateDiaryEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class TemplateDiaryRepositorySupportImpl implements TemplateDiaryRepositorySupport {

  private final JPAQueryFactory queryFactory;

  @Override
  public TemplateDiaryEntity getTemplateToDiaryId(int diaryId, DiaryType diaryType) {
    return queryFactory.selectFrom(templateDiaryEntity)
        .where(templateDiaryEntity.diary.diaryId.eq(diaryId),notNullTemplate(diaryType))
        .fetchOne();
  }

  BooleanExpression notNullTemplate(DiaryType diaryType) {
    return switch (diaryType) {
      case TRACKER -> templateDiaryEntity.timeTracker.isNotNull();
      case BOOK -> templateDiaryEntity.bookTracker.isNotNull();
      default -> throw new TiniException(TiniErrorCode.TEMPLATE_NOT_FOUND);
    };
  }
}
