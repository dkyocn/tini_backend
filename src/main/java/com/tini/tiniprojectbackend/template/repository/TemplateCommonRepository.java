package com.tini.tiniprojectbackend.template.repository;

import com.tini.tiniprojectbackend.template.entity.TemplateCommonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemplateCommonRepository extends JpaRepository<TemplateCommonEntity, Integer>, TemplateCommonRepositorySupport{

}
