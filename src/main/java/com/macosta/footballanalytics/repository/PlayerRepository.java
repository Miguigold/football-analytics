package com.macosta.footballanalytics.repository;

import com.macosta.footballanalytics.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
}
