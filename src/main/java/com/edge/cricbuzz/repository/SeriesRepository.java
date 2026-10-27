package com.edge.cricbuzz.repository;

import com.edge.cricbuzz.domain.Series;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeriesRepository extends JpaRepository<Series, Long> {
}
