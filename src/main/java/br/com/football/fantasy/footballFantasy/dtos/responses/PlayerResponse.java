package br.com.football.fantasy.footballFantasy.dtos.responses;

import br.com.football.fantasy.footballFantasy.models.enums.Mode;
import br.com.football.fantasy.footballFantasy.models.enums.Position;
import br.com.football.fantasy.footballFantasy.models.structures.Player;
import br.com.football.fantasy.footballFantasy.models.enums.Console;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Getter
@Setter
@AllArgsConstructor

public class PlayerResponse {
    private String gametarg;
    private Console console;
    private Mode mode;

   public PlayerResponse(Player player){
       this.gametarg = player.getGametarg();
       this.console = player.getConsole();
       this.mode = player.getMode();
    }

}
