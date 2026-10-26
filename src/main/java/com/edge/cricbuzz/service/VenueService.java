package com.edge.cricbuzz.service;


import com.edge.cricbuzz.domain.Venue;
import com.edge.cricbuzz.domain.dto.VenueRequest;
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


    public ResponseEntity<Venue> addVenues(VenueRequest venueRequest){
              Venue venue  = Venue.builder()
                      .name(venueRequest.getName())
                      .city(venueRequest.getCity()).build();

              return ResponseEntity.status(HttpStatus.CREATED).body(venueRepository.save(venue));
    }


    public ResponseEntity<Venue>  updateVenues(VenueRequest venueRequest , Long id){
        Venue existingVenue = venueRepository.getById(id);
        Venue updatedVenue = Venue.builder()
                .id(existingVenue.getId())
                .name(venueRequest.getName())
                .city(venueRequest.getCity()).build();
        return ResponseEntity.status(HttpStatus.CREATED).body(venueRepository.save(updatedVenue));

    }

    public String deleteVenue(Long id){
        venueRepository.deleteById(id);
        return "Venue with id " + id + "deleted";
    }

}
