package co.fc.footballchampionsAPI.entities;

import co.fc.footballchampionsAPI.enums.FrecciaCartaAzione;
import jakarta.persistence.*;

@Entity
@Table
public class CartaAzione {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nomeCarta;
    private String descrizioneCarta;
    private String annata;
    private FrecciaCartaAzione [] frecce = new FrecciaCartaAzione[8];

    public CartaAzione() {
    }

    public CartaAzione(Long id, String nomeCarta, String descrizioneCarta, String annata, FrecciaCartaAzione[] frecce) {
        this.id = id;
        this.nomeCarta = nomeCarta;
        this.descrizioneCarta = descrizioneCarta;
        this.annata = annata;
        this.frecce = frecce;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCarta() {
        return nomeCarta;
    }

    public void setNomeCarta(String nomeCarta) {
        this.nomeCarta = nomeCarta;
    }

    public String getDescrizioneCarta() {
        return descrizioneCarta;
    }

    public void setDescrizioneCarta(String descrizioneCarta) {
        this.descrizioneCarta = descrizioneCarta;
    }

    public String getAnnata() {
        return annata;
    }

    public void setAnnata(String annata) {
        this.annata = annata;
    }

    public FrecciaCartaAzione[] getFrecce() {
        return frecce;
    }

    public void setFrecce(FrecciaCartaAzione[] frecce) {
        this.frecce = frecce;
    }
}
