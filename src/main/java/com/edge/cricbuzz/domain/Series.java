package com.edge.cricbuzz.domain;


import com.edge.cricbuzz.domain.enums.Gender;
import com.edge.cricbuzz.domain.enums.SeriesCategory;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Series {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "series_name", nullable = false, unique = true)
    private String name;

    @Column(name = "series_category", nullable = false)
    @Enumerated(EnumType.STRING)
    private SeriesCategory category;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "series_start_date", nullable = false)
    private Date startDate;

    @Column(name = "series_end_date", nullable = false)
    private Date endData;

}
