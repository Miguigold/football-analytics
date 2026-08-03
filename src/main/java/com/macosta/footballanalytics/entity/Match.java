package com.macosta.footballanalytics.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Match {

    @Id
    private Long id;

    private LocalDateTime date;

    @ManyToOne
    private Season season;

    @ManyToOne
    private Competition competition;

    @ManyToOne
    private Team homeTeam;

    @ManyToOne
    private Team awayTeam;

    private Integer homeGoals;
    private Integer awayGoals;
}