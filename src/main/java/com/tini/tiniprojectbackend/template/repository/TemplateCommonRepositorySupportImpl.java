package com.tini.tiniprojectbackend.template.repository;

import static com.tini.tiniprojectbackend.template.entity.QTemplateCommonEntity.templateCommonEntity;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.tini.tiniprojectbackend.template.entity.TemplateCommonEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class TemplateCommonRepositorySupportImpl implements TemplateCommonRepositorySupport {

  private final JPAQueryFactory queryFactory;


  @Override
  public TemplateCommonEntity findById(int id) {
    return queryFactory.selectFrom(templateCommonEntity)
        .where(templateCommonEntity.id.eq(id))
        .fetchOne();
  }
}
