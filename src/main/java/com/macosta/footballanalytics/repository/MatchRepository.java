package com.macosta.footballanalytics.repository;

import com.macosta.footballanalytics.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match, Long> {
}
