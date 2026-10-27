package com.edge.cricbuzz.controllers;


import com.edge.cricbuzz.domain.Series;
import com.edge.cricbuzz.domain.dto.SeriesRequest;
import com.edge.cricbuzz.service.SeriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/series")
@RequiredArgsConstructor
public class SeriesController {

    private final SeriesService seriesService;

    @GetMapping
    public ResponseEntity<List<Series>> getSeries(){
        return seriesService.getSeries();
    }

    @PostMapping
    public ResponseEntity<Series>  createSeries(@RequestBody SeriesRequest seriesRequest){
        return seriesService.createSeries(seriesRequest);
    }

}
