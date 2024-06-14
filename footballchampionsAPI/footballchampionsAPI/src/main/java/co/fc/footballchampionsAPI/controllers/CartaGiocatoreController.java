package co.fc.footballchampionsAPI.controllers;

import co.fc.footballchampionsAPI.entities.CartaGiocatore;
import co.fc.footballchampionsAPI.services.CartaGiocatoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/giocatore")
public class CartaGiocatoreController {

    @Autowired
    CartaGiocatoreService cartaGiocatoreService;

    @PostMapping
    public CartaGiocatore creaCarta(@RequestBody CartaGiocatore cartaGiocatore){
        return cartaGiocatoreService.aggiungiGiocatore(cartaGiocatore);
    }

    @GetMapping("/{id}")
    public CartaGiocatore cercaGiocatorePerId(@PathVariable Long id) {
        return cartaGiocatoreService.trovaGiocatorePerId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminaGiocatore(@PathVariable Long id) {
        cartaGiocatoreService.eliminaGiocatore(id);
    }

    @GetMapping("{cognomeGiocatore}")
    public List<CartaGiocatore> cercaPerCognome(@PathVariable String cognome) {
        return cartaGiocatoreService.trovaGiocatorePerCognome(cognome);
    }

    @GetMapping("/punteggio-minore-di")
    public List<CartaGiocatore> cercaPerPunteggioMinoreDi(@RequestParam int punteggio) {
        return cartaGiocatoreService.trovaGiocatorePerPunteggioMinoreDi(punteggio);
    }

    @GetMapping("/punteggio-maggiore-di")
    public List<CartaGiocatore> cercaPerPunteggioMaggioreDi(@RequestParam int punteggio) {
        return cartaGiocatoreService.trovaGiocatorePerPunteggioMaggioreDi(punteggio);
    }

    @GetMapping("/punteggio-compreso")
    public List<CartaGiocatore> cercaPerPunteggioCompresoTra(@RequestParam int inf, @RequestParam int sup) {
        return cartaGiocatoreService.trovaGiocatoreTraDuePunteggi(inf, sup);
    }

}
