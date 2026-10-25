package com.edge.cricbuzz.service;


import com.edge.cricbuzz.domain.Venue;
import com.edge.cricbuzz.repository.VenueRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VenueService {

    private final VenueRepository venueRepository;


    public ResponseEntity<List<Venue>> getVenues(){

        List<Venue> venues = venueRepository.findAll();
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(venues);
    }

}
