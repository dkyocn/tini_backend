package com.tini.tiniprojectbackend.template.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PointRepositorySupportImpl implements DPRepositorySupport {

  private final JPAQueryFactory queryFactory;
}
