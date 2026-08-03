package com.macosta.footballanalytics.entity;

import com.macosta.footballanalytics.enums.PlayerPosition;
import com.macosta.footballanalytics.enums.PlayerPreferredFoot;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Player {

    @Id
    private Long id;

    private String name;
    private LocalDate birthDate;
    private String nationality;

    @Enumerated(EnumType.STRING)
    PlayerPosition playerPosition;

    private double height;
    private double weight;

    @Enumerated(EnumType.STRING)
    PlayerPreferredFoot playerPreferredFoot;

    private BigDecimal marketValue;

    @ManyToOne
    private Team team;
}
