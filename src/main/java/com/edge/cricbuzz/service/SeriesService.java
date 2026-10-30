package com.edge.cricbuzz.service;


import com.edge.cricbuzz.domain.Series;
import com.edge.cricbuzz.domain.dto.SeriesRequest;
import com.edge.cricbuzz.domain.enums.Gender;
import com.edge.cricbuzz.domain.enums.SeriesCategory;
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

    public ResponseEntity<Series> createSeries(SeriesRequest seriesRequest){
        Series series = Series.builder()
                .gender(seriesRequest.getGender())
                .category(seriesRequest.getCategory())
                .name(seriesRequest.getName())
                .startDate(seriesRequest.getStartDate())
                .endDate(seriesRequest.getEndDate())
                .build();

        return ResponseEntity.status(HttpStatus.CREATED).body(seriesRepository.save(series));
    }

    public ResponseEntity<Series> updateSeries(SeriesRequest seriesRequest, Long id){
        Series existingSeries = seriesRepository.getById(id);
        Series updatedSeries = Series.builder()
                .id(existingSeries.getId())
                .gender(seriesRequest.getGender())
                .category(seriesRequest.getCategory())
                .name(seriesRequest.getName())
                .startDate(seriesRequest.getStartDate())
                .endDate(seriesRequest.getEndDate())
                .build();


        return ResponseEntity.status(HttpStatus.CREATED).body(seriesRepository.save(updatedSeries));
    }


    public String deleteSeries(Long id){
        seriesRepository.deleteById(id);
        return "Series named "+ id +" Deleted successfully";
    }


}
