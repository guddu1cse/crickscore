package com.crick.app.crickscore.service;

import com.crick.app.crickscore.entities.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {

    List<Match> getAllMatches();

    List<Match> getLiveMatches();

    List<List<String>> getPointTable();

}
