package com.macosta.footballanalytics.repository;

import com.macosta.footballanalytics.entity.Competition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompetitionRepository extends JpaRepository<Competition, Long> {
}
