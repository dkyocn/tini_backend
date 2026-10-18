package com.tini.tiniprojectbackend.template.repository;

import com.tini.tiniprojectbackend.template.entity.TimeTrackerEntity;
import java.time.LocalDateTime;

public interface TimeTrackerRepositorySupport {

  // 날짜별 조회
  TimeTrackerEntity getTimeTrackerByDate(LocalDateTime findDate);
  TimeTrackerEntity getTimeTracker(LocalDateTime findDate, String customTime);
}
