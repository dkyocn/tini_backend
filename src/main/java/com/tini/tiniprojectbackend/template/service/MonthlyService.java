package com.tini.tiniprojectbackend.template.service;

import com.tini.tiniprojectbackend.template.dto.MonthlyItemDTO;
import com.tini.tiniprojectbackend.template.repository.MonthlyItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@RequiredArgsConstructor
public class MonthlyService {

  private final MonthlyItemRepository monthlyItemRepository;


  public MonthlyItemDTO getMonthlyItemById(@RequestParam int id) {
    return null;
  }

}
