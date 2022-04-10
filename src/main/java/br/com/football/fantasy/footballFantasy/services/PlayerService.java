package br.com.football.fantasy.footballFantasy.services;

import br.com.football.fantasy.footballFantasy.dtos.requests.PlayerRequest;
import br.com.football.fantasy.footballFantasy.dtos.responses.PlayerResponse;
import br.com.football.fantasy.footballFantasy.models.structures.Player;
import br.com.football.fantasy.footballFantasy.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service

public class PlayerService {
    @Autowired
    PlayerRepository playerRepository;

    public PlayerResponse createNewUser(PlayerRequest playerRequest){
        Player player = new Player(playerRequest);
        playerRepository.save(player);
        return new PlayerResponse(player);
    }

    public Player editUser(PlayerRequest playerRequest, UUID id){

        Player player = playerRepository.findById(id).orElseThrow();
        player.setGametarg(playerRequest.getGametarg());
        player.setName(playerRequest.getName());
        player.setAge(playerRequest.getAge());
        player.setMode(playerRequest.getMode());
        player.setConsole(playerRequest.getConsole());
        player.setHeartTeam(playerRequest.getHeartTeam());
        player.setMail(playerRequest.getMail());
        player.setAddress(playerRequest.getAddress());
        player.setLocation(playerRequest.getLocation());
        player.setCountry(playerRequest.getCountry());
        player.setPassword(playerRequest.getPassword());

        return playerRepository.save(player);

    }

    public List<Player> listPlayersByName(String name){
        if (name != null) {
            return playerRepository.findByName(name);
        } else {
            return playerRepository.findAll();
        }

    }

    public List<Player> getAllPlayers() {
        return new ArrayList<>(playerRepository.findAll());
    }

    public void deleteUser(UUID id){
        Player player = playerRepository.findById(id).orElseThrow();
        playerRepository.delete(player);

    }


    public PlayerResponse getUserById(UUID id){
        Player player = playerRepository.findById(id).orElseThrow();
        return new PlayerResponse(player);
    }




}
