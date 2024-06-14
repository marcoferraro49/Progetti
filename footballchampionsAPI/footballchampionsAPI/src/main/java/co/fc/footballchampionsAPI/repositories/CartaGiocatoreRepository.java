package co.fc.footballchampionsAPI.repositories;

import co.fc.footballchampionsAPI.entities.CartaGiocatore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartaGiocatoreRepository extends JpaRepository<CartaGiocatore, Long> {

    List<CartaGiocatore> findByCognomeGiocatore(String cognome);
    List<CartaGiocatore> findByPunteggioCartaLessThanEqual(int punteggioCarta);
    List<CartaGiocatore> findByPunteggioCartaGreaterThanEqual(int punteggioCarta);
    List<CartaGiocatore> findByPunteggioCartaBetween(int puntiInf, int puntiSup);
}
