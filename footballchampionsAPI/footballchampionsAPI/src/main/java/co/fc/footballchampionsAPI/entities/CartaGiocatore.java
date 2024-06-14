package co.fc.footballchampionsAPI.entities;

import co.fc.footballchampionsAPI.enums.Abilita;
import co.fc.footballchampionsAPI.enums.Ruolo;
import jakarta.persistence.*;

import java.io.File;

@Entity
@Table(name = "Giocatore")
public class CartaGiocatore {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nomeGiocatore;
    private String cognomeGiocatore;
    private Ruolo ruolo;
    private int rapidita;
    private int tackle;
    private int tiro;
    private int classe;
    private int colpoDiTesta;
    private int punteggioCarta;
    private String squadra;
    private String annata;
    private Abilita[] abilita = new Abilita[2];
    private String fotoCarta;

    @ManyToOne
    private Deck deck;

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public CartaGiocatore() {
    }

    public CartaGiocatore(Long id, String nomeGiocatore, String cognomeGiocatore, Ruolo ruolo, int rapidita, int tackle, int tiro, int classe, int colpoDiTesta, int punteggioCarta, String squadra, String annata, Abilita[] abilita, String fotoCarta, Deck deck) {
        this.id = id;
        this.nomeGiocatore = nomeGiocatore;
        this.cognomeGiocatore = cognomeGiocatore;
        this.ruolo = ruolo;
        this.rapidita = rapidita;
        this.tackle = tackle;
        this.tiro = tiro;
        this.classe = classe;
        this.colpoDiTesta = colpoDiTesta;
        this.punteggioCarta = punteggioCarta;
        this.squadra = squadra;
        this.annata = annata;
        this.abilita = abilita;
        this.fotoCarta = fotoCarta;
        this.deck = deck;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeGiocatore() {
        return nomeGiocatore;
    }

    public void setNomeGiocatore(String nomeGiocatore) {
        this.nomeGiocatore = nomeGiocatore;
    }

    public String getCognomeGiocatore() {
        return cognomeGiocatore;
    }

    public void setCognomeGiocatore(String cognomeGiocatore) {
        this.cognomeGiocatore = cognomeGiocatore;
    }

    public Ruolo getRuolo() {
        return ruolo;
    }

    public void setRuolo(Ruolo ruolo) {
        this.ruolo = ruolo;
    }

    public int getRapidita() {
        return rapidita;
    }

    public void setRapidita(int rapidita) {
        this.rapidita = rapidita;
    }

    public int getTackle() {
        return tackle;
    }

    public void setTackle(int tackle) {
        this.tackle = tackle;
    }

    public int getTiro() {
        return tiro;
    }

    public void setTiro(int tiro) {
        this.tiro = tiro;
    }

    public int getClasse() {
        return classe;
    }

    public void setClasse(int classe) {
        this.classe = classe;
    }

    public int getColpoDiTesta() {
        return colpoDiTesta;
    }

    public void setColpoDiTesta(int colpoDiTesta) {
        this.colpoDiTesta = colpoDiTesta;
    }

    public int getPunteggioCarta() {
        return punteggioCarta;
    }

    public void setPunteggioCarta(int punteggioCarta) {
        this.punteggioCarta = punteggioCarta;
    }

    public String getSquadra() {
        return squadra;
    }

    public void setSquadra(String squadra) {
        this.squadra = squadra;
    }

    public String getAnnata() {
        return annata;
    }

    public void setAnnata(String annata) {
        this.annata = annata;
    }

    public Abilita[] getAbilita() {
        return abilita;
    }

    public void setAbilita(Abilita[] abilita) {
        this.abilita = abilita;
    }

    public String getFotoCarta() {
        return fotoCarta;
    }

    public void setFotoCarta(String fotoCarta) {
        this.fotoCarta = fotoCarta;
    }
}
