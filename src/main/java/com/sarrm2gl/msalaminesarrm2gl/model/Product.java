
//mouhamadou lamine sarr m2gl

package com.sarrm2gl.msalaminesarrm2gl.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import java.util.List;

@Entity
//@JsonFilter("monFiltreDynamique")
public class Product {

    @Id
    @GeneratedValue
    private int id;

    @Length(min=3, max=20)
    private String nom;

    @Min(value = 1)
    private int prix;
    //lamine sarr  ici constructeur par défaut
    public Product() {
    }

    //lamine sarr  ici constructeur pour nos tests

    public Product(int id, String nom, int prix) {
        this.id=id;
        this.nom=nom;
        this.prix=prix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom=nom;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix=prix;
    }

    @Override
    public String toString(){
        return "Product{"+
                "id=" + id +
                ", nom='"+ nom + '\'' +
                ", prix=" + prix+ '}';
    }


}

