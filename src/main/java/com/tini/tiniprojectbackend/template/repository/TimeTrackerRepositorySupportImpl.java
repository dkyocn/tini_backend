package com.tini.tiniprojectbackend.template.repository;

import static com.tini.tiniprojectbackend.template.entity.QTimeTrackerEntity.timeTrackerEntity;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.tini.tiniprojectbackend.template.entity.TimeTrackerEntity;
import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class TimeTrackerRepositorySupportImpl implements TimeTrackerRepositorySupport {

  private final JPAQueryFactory queryFactory;

  @Override
  public TimeTrackerEntity getTimeTrackerByDate(LocalDateTime findDate) {
//      return queryFactory.selectFrom(timeTrackerEntity)
//      .where(timeTrackerEntity.id.)
//      .fetchOne();
    return null;
  }

  @Override
  public TimeTrackerEntity getTimeTracker(LocalDateTime findDate, String customTime) {
    return null;
  }
}
