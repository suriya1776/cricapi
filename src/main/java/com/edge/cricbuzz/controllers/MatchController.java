package com.edge.cricbuzz.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/match")
public class MatchController {



    @GetMapping
    public String getMatch(){
        return "Match details fetched";
    }


}
