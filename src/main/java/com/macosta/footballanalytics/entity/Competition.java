package com.macosta.footballanalytics.entity;

import com.macosta.footballanalytics.enums.CompetitionType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Competition {

    @Id
    private Long id;

    private String name;
    private String country;

    @Enumerated(EnumType.STRING)
    CompetitionType competitionType;

    private String logoUrl;

}
