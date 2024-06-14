package co.fc.footballchampionsAPI.services;

import co.fc.footballchampionsAPI.repositories.DeckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeckService {

    @Autowired
    private DeckRepository deckRepository;


}
