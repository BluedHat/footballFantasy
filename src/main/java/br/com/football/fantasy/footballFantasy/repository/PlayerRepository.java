package br.com.football.fantasy.footballFantasy.repository;

import br.com.football.fantasy.footballFantasy.models.structures.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.UUID;

@Repository

public interface PlayerRepository extends JpaRepository<Player, UUID> {
     List<Player> findByName(String Name);
}
