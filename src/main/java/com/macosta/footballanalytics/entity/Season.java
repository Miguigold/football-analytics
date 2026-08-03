package com.macosta.footballanalytics.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Season {

    @Id
    private Long id;

    private String name;
    private Integer startYear;
    private Integer endYear;

    @ManyToOne
    private Competition competition;
}
