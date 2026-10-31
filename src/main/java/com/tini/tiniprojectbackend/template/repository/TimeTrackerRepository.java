package com.tini.tiniprojectbackend.template.repository;

import com.tini.tiniprojectbackend.template.entity.TimeTrackerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeTrackerRepository extends JpaRepository<TimeTrackerEntity,Integer>, TimeTrackerRepositorySupport {

}
