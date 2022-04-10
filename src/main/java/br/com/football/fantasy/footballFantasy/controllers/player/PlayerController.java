package br.com.football.fantasy.footballFantasy.controllers.player;

import br.com.football.fantasy.footballFantasy.dtos.requests.PlayerRequest;
import br.com.football.fantasy.footballFantasy.models.structures.Player;
import br.com.football.fantasy.footballFantasy.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/player")

public class PlayerController {
    @Autowired
    PlayerService playerService;

    @GetMapping()
    public ResponseEntity <List<Player>> listAll(){
        return ResponseEntity.status(HttpStatus.OK).body(playerService.getAllPlayers());
    }

    @PostMapping("/create")
    public ResponseEntity<Object> createPlayer(@RequestBody @Valid PlayerRequest playerRequest){
        return ResponseEntity.status(HttpStatus.CREATED).body(playerService.createNewUser(playerRequest));
    }


    @GetMapping("/{id}")
    public ResponseEntity<Object> getPlayerById(@PathVariable(value = "id") UUID id){
        return ResponseEntity.status(HttpStatus.OK).body(playerService.getUserById(id));
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<Object> excludeUser(@PathVariable(value = "id") UUID id) {
        playerService.deleteUser(id);
        return ResponseEntity.status(HttpStatus.OK).body("Player Banned");
    }

}
