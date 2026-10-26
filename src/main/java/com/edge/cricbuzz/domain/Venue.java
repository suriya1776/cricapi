package com.edge.cricbuzz.domain;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "match_venue")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Venue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "stadium_name", nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String city;

}
