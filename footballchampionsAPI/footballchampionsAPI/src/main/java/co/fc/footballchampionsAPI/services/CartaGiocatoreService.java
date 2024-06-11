package co.fc.footballchampionsAPI.services;

import co.fc.footballchampionsAPI.entities.CartaGiocatore;
import co.fc.footballchampionsAPI.repositories.CartaGiocatoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
