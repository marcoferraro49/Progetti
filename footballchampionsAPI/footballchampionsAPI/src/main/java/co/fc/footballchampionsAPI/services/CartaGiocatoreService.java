package co.fc.footballchampionsAPI.services;

import co.fc.footballchampionsAPI.entities.CartaGiocatore;
import co.fc.footballchampionsAPI.repositories.CartaGiocatoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartaGiocatoreService {

    @Autowired
    private CartaGiocatoreRepository giocatoreRepository;

    public CartaGiocatore aggiungiGiocatore(CartaGiocatore cartaGiocatore){
        return giocatoreRepository.save(cartaGiocatore);
    }

    public CartaGiocatore trovaGiocatorePerId(Long id){
        return giocatoreRepository.findById(id).orElse(null);
    }

    public void eliminaGiocatore(Long id){
        giocatoreRepository.deleteById(id);
    }

    public List<CartaGiocatore> trovaGiocatorePerCognome(String cognome){
        return giocatoreRepository.findByCognomeGiocatore(cognome);
    }

    public List<CartaGiocatore> trovaGiocatorePerPunteggioMinoreDi(int punteggioCarta){
        return giocatoreRepository.findByPunteggioCartaLessThanEqual(punteggioCarta);
    }

    public List<CartaGiocatore> trovaGiocatorePerPunteggioMaggioreDi(int punteggioCarta) {
        return giocatoreRepository.findByPunteggioCartaGreaterThanEqual(punteggioCarta);
    }

    public List<CartaGiocatore> trovaGiocatoreTraDuePunteggi(int puntiInf, int puntiSup) {
        return giocatoreRepository.findByPunteggioCartaBetween(puntiInf, puntiSup);
    }


}
