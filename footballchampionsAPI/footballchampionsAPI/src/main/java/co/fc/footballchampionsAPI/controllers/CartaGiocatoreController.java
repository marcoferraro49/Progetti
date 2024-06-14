package co.fc.footballchampionsAPI.controllers;

import co.fc.footballchampionsAPI.entities.CartaGiocatore;
import co.fc.footballchampionsAPI.services.CartaGiocatoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/giocatore")
public class CartaGiocatoreController {

    @Autowired
    CartaGiocatoreService cartaGiocatoreService;

    @PostMapping
    public CartaGiocatore creaCarta(@RequestBody CartaGiocatore cartaGiocatore){
        return cartaGiocatoreService.aggiungiGiocatore(cartaGiocatore);
    }


}
