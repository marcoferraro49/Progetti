package co.fc.footballchampionsAPI.repositories;

import co.fc.footballchampionsAPI.entities.CartaAzione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartaAzioneRepository extends JpaRepository<CartaAzione, Long> {
}
