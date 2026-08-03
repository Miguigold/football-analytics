package com.macosta.footballanalytics.repository;

import com.macosta.footballanalytics.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
