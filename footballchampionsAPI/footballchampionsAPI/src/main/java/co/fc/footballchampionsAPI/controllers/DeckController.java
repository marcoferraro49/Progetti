package co.fc.footballchampionsAPI.controllers;

import co.fc.footballchampionsAPI.services.DeckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deck")
public class DeckController {

    @Autowired
    DeckService deckService;


}
