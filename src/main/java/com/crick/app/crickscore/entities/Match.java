package com.crick.app.crickscore.entities;


import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder


@Entity
@Table(name = "crick_matches")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int matchId;
    private String teamHeading;
    private String matchNumberVenue;
    private String battingTeam;
    private String battingTeamScore;
    private String bowlTeam;
    private String bowlTeamScore;
    private String liveText;
    private String matchLink;
    private String textComplete;

    @Enumerated
    private MatchStatus matchStatus;

    private Date date = new Date();


    public void setMatchStatus() {
        if(textComplete.isBlank())
            this.matchStatus = MatchStatus.LIVE;
            else this.matchStatus = MatchStatus.COMPLETED;
    }
}
