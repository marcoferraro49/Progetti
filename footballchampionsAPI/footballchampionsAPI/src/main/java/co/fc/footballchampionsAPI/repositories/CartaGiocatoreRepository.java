package co.fc.footballchampionsAPI.repositories;

import co.fc.footballchampionsAPI.entities.CartaGiocatore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartaGiocatoreRepository extends JpaRepository<CartaGiocatore, Long> {

}
