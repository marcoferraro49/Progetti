package co.fc.footballchampionsAPI.controllers;

import co.fc.footballchampionsAPI.services.CartaAzioneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/azione")
public class CartaAzioneController {

    @Autowired
    CartaAzioneService cartaAzioneService;


}
