package br.com.football.fantasy.footballFantasy.models.structures;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Table(name = "TEAM")
@Data
@Entity
@AllArgsConstructor

public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    /* @JsonIgnore
    @OneToMany(mappedBy = "team", cascade = CascadeType.ALL)
    private List<FootballPlayer> squad;*/
    @Column
    private int points;
    @Column
    private int wons;
    @Column
    private int draw;
    @Column
    private int loses;
    @Column
    private int trophies;
    @Column
    private int classification;

}
