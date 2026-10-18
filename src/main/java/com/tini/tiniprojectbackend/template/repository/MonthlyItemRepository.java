package com.tini.tiniprojectbackend.template.repository;

import com.tini.tiniprojectbackend.template.entity.MonthlyItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonthlyItemRepository extends JpaRepository<MonthlyItemEntity, Integer>, MonthlyItemRepositorySupport{

}
