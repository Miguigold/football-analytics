package com.macosta.footballanalytics.entity;

import jakarta.persistence.Entity;
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
public class Team {

    @Id
    private Long id;

    private String name;
    private String shortName;
    private String country;
    private int founded;
    private String stadium;
    private String logoUrl;
}
