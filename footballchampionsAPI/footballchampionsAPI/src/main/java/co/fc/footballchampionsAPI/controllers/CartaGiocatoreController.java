package co.fc.footballchampionsAPI.controllers;

import co.fc.footballchampionsAPI.services.CartaGiocatoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/giocatore")
public class CartaGiocatoreController {

    @Autowired
    CartaGiocatoreService cartaGiocatoreService;


}
