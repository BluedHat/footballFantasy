package br.com.football.fantasy.footballFantasy.models.structures;

import br.com.football.fantasy.footballFantasy.models.enums.PlayerTeam;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import java.util.UUID;

@Table(name = "FOOTBALLPLAYER")
@Data
@Entity
@AllArgsConstructor

public class FootballPlayer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column
    private int matches;
    @Column
    private boolean injury;
    @Column
    private String playerPosition;
    @Column
    private int earnPoints;
    @Column
    private int losePoints;
}
