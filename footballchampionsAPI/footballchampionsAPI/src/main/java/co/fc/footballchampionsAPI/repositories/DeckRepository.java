package co.fc.footballchampionsAPI.repositories;

import co.fc.footballchampionsAPI.entities.Deck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeckRepository extends JpaRepository<Deck, Long> {
}
