package com.edge.cricbuzz.controllers;


import com.edge.cricbuzz.domain.Venue;
import com.edge.cricbuzz.repository.VenueRepository;
import com.edge.cricbuzz.service.VenueService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/venues")
@RequiredArgsConstructor
public class VenueController {


    private final VenueService venueService;


    @GetMapping
    public ResponseEntity<List<Venue>> getVenues(){
           return venueService.getVenues();
    }

    @PostMapping
    public String addVenues(){
        return "Add new venues";
    }

    @PutMapping
    public String updateVenues(){
        return "Update a existing venues";
    }

    @DeleteMapping
    public String deleteVenues(){
        return "Delete a venue";
    }

}
