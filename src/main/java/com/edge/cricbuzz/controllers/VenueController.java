package com.edge.cricbuzz.controllers;


import com.edge.cricbuzz.domain.Venue;
import com.edge.cricbuzz.domain.dto.VenueRequest;
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
    public ResponseEntity<Venue> addVenues(@RequestBody VenueRequest venueRequest){

        return venueService.addVenues(venueRequest);

    }

    @PutMapping("/{id}")
    public ResponseEntity<Venue> updateVenues(@RequestBody VenueRequest venueRequest , @PathVariable Long id){

        return venueService.updateVenues(venueRequest, id);
    }

    @DeleteMapping("/{id}")
    public String deleteVenue(@PathVariable Long id){

        return venueService.deleteVenue(id);
    }

}
