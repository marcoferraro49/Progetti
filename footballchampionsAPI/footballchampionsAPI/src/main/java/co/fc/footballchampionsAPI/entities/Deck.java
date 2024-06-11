package co.fc.footballchampionsAPI.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Deck {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany
    private List<CartaGiocatore> listaCarte;

    public Deck() {
    }

    public Deck(Long id, List<CartaGiocatore> listaCarte) {
        this.id = id;
        this.listaCarte = listaCarte;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<CartaGiocatore> getListaCarte() {
        return listaCarte;
    }

    public void setListaCarte(List<CartaGiocatore> listaCarte) {
        this.listaCarte = listaCarte;
    }
}
