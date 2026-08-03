package com.macosta.footballanalytics.repository;

import com.macosta.footballanalytics.entity.Season;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeasonRepository extends JpaRepository<Season, Long> {
}
