/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etu1922.framework.model;

import etu1922.framework.ModelView;
import etu1922.framework.annotation.Annotation;

/**
 *
 * @author Kanto
 */
public class Employe {
    String nom;
    String prenom;

    public String getNom() {
        return nom;
    }

    @Annotation(value = "/nom")
    public void setNom() {
        this.nom = "Andrianotahina";
        System.out.println("Client nom");
    }

    @Annotation(value = "/prenom")
    public ModelView getPrenom() {
        System.out.println("Client prenom");
        ModelView modelView = new ModelView("index.jsp");
        return modelView;
    }

    public void setPrenom() {
        this.prenom = "Kanto";
        System.out.println("Client prenom");
    }

    public Employe() {
    }
}
