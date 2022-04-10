package br.com.football.fantasy.footballFantasy.dtos.requests;

import br.com.football.fantasy.footballFantasy.models.enums.*;
import br.com.football.fantasy.footballFantasy.models.structures.Player;
import lombok.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor

public class PlayerRequest {
    private UUID id;
    @NotEmpty @NotNull @Size(max = 8)
    private String gametarg;
    @NotEmpty @NotNull @Size(min = 6 , max = 25)
    private String name;
    private int age;
    private Mode mode;
    private Console console;
    private PlayerTeam heartTeam;
    @NotNull @NotEmpty
    private String mail;
    private String address;
    private int location;
    private Country country;
    @NotEmpty @NotNull @Size(max = 8)
    private String password;

    public static PlayerRequest of(Player player){
        return PlayerRequest.builder()
                .gametarg(player.getGametarg())
                .name(player.getName())
                .age(player.getAge())
                .mode(player.getMode())
                .console(player.getConsole())
                .heartTeam(player.getHeartTeam())
                .mail(player.getMail())
                .address(player.getAddress())
                .location(player.getLocation())
                .country(player.getCountry())
                .password(player.getPassword())
                .build();
    }
}
