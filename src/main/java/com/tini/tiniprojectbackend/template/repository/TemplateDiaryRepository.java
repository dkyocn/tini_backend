package com.tini.tiniprojectbackend.template.repository;

import com.tini.tiniprojectbackend.template.entity.TemplateDiaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemplateDiaryRepository extends JpaRepository<TemplateDiaryEntity, Integer>, TemplateDiaryRepositorySupport {

}
