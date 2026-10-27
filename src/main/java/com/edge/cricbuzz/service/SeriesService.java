package com.edge.cricbuzz.service;


import com.edge.cricbuzz.domain.Series;
import com.edge.cricbuzz.repository.SeriesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SeriesService {

    private final SeriesRepository seriesRepository;

    public ResponseEntity<List<Series>> getSeries(){

        List<Series> series = seriesRepository.findAll();

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(series);
    }


}
