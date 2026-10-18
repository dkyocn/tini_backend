package com.tini.tiniprojectbackend.template.repository;

import com.tini.tiniprojectbackend.template.entity.PointEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DPRepository extends JpaRepository<PointEntity, Integer>, DPRepositorySupport {

}
