package com.crick.app.crickscore.controller;


import com.crick.app.crickscore.entities.Match;
import com.crick.app.crickscore.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchController {

    @Autowired
    public MatchService matchService;

    public MatchController(MatchService matchService){
        this.matchService = matchService;
    }

    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches(){
        return new ResponseEntity<>(this.matchService.getLiveMatches() , HttpStatus.OK);
    }

    @GetMapping("/allmatches")
    public ResponseEntity<List<Match>> getAllMatches(){
        return new ResponseEntity<>(this.matchService.getAllMatches() , HttpStatus.OK);
    }

    @GetMapping("/getpointtable")
    public ResponseEntity<List<List<String>>> getPointTable(){
        return new ResponseEntity<>(this.matchService.getPointTable() , HttpStatus.OK);
    }

}
