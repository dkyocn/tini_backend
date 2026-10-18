package com.tini.tiniprojectbackend.template.service;

import com.tini.tiniprojectbackend.common.exception.TiniErrorCode;
import com.tini.tiniprojectbackend.common.exception.TiniException;
import com.tini.tiniprojectbackend.template.dto.TimeTrackerDTO;
import com.tini.tiniprojectbackend.template.entity.TimeTrackerEntity;
import com.tini.tiniprojectbackend.template.repository.TimeTrackerRepository;
import jakarta.transaction.Transactional;
import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TimeTrackerService {

  private final TimeTrackerRepository timeTrackerRepository;

  // monthly time tracker 조회 - 날짜 범위
  public TimeTrackerDTO getTimeTrackerByMonth(LocalDateTime findMonth) {

    TimeTrackerEntity timeTrackerByDate = timeTrackerRepository.getTimeTrackerByDate(findMonth);

    if (timeTrackerByDate == null) {
      throw new TiniException(TiniErrorCode.TEMPLATE_NOT_FOUND);
    } else {
      return TimeTrackerDTO.from(timeTrackerByDate);
    }
  }

  // daily time tracker 조회 - 단일 날짜
  public TimeTrackerDTO getTimeTrackerById(LocalDateTime customTime) {
    return null;
  }

  // 저장 - 오늘의 트래킹 사용
  public void createTimeTracker(TimeTrackerDTO timeTrackerDTO) {
    try {
      timeTrackerRepository.save(TimeTrackerEntity.createTimeTrackerBuilder().timeTrackerDTO(timeTrackerDTO).createTimeTrackerBuilder());
    } catch (RuntimeException e) {
      throw new TiniException(TiniErrorCode.TEMPLATE_CREATE_FAILED);
    }
  }

  // 수정 - 오늘의 트래킹 사용
  @Transactional
  public void updateTimeTracker(int diaryId, TimeTrackerDTO timeTrackerDTO, LocalDateTime findDate) {
    TimeTrackerEntity timeTrackerByDate = timeTrackerRepository.getTimeTrackerByDate(findDate);

    if (timeTrackerByDate == null) {
      throw new TiniException(TiniErrorCode.TEMPLATE_NOT_FOUND);
    } else {
      timeTrackerByDate.updateTimeTracker(timeTrackerDTO);
    }
  }
}
