package br.com.football.fantasy.footballFantasy.models.structures;

import br.com.football.fantasy.footballFantasy.dtos.requests.PlayerRequest;
import br.com.football.fantasy.footballFantasy.models.enums.*;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;

@Table(name = "PLAYER")
@Data
@Entity
@NoArgsConstructor

public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @NotEmpty @NotNull @Size(max = 8)
    @Column
    private String gametarg;
    @Column
    @NotEmpty @NotNull @Size(min = 6 , max = 25)
    private String name;
    @Column
    private int age;
    @Column
    private Mode mode;
    @Column
    private Console console;
    @Column
    private PlayerTeam heartTeam;
    @Column
    @NotNull @NotEmpty
    private String mail;
    @Column
    private String address;
    @Column
    private int location;
    @Column
    private Country country;
    @Column
    @NotEmpty @NotNull @Size(max = 8)
    private String password;
    /*@JsonIgnore
    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL)
    private List<Team> teams;*/

    public Player(PlayerRequest playerRequest){
        this.gametarg = playerRequest.getGametarg();
        this.name = playerRequest.getName();
        this.age = playerRequest.getAge();
        this.mode = playerRequest.getMode();
        this.console = playerRequest.getConsole();
        this.heartTeam = playerRequest.getHeartTeam();
        this.mail = playerRequest.getMail();
        this.address = playerRequest.getAddress();
        this.location = playerRequest.getLocation();
        this.country = playerRequest.getCountry();
        this.password = playerRequest.getPassword();
    }
}
