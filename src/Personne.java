
/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Tue Apr 11 17:10:50 CEST 2017
*
*/

import java.util.*;

public class Personne{
    private String nom;
    private String profession;
    private int age;
    private Ville ville;
        
    public Personne(String nom, String profession,
            int age, Ville ville) {
        this.nom = nom;
        this.age = age;
        this.ville = ville;
        ville.ajouteHabitant(this);
        this.profession = profession;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return the profession
     */
    public String getProfession() {
        return profession;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @return the ville
     */
    public Ville getVille() {
        return ville;
    }
	

    public String toString(){
        return nom + ", " + profession + ", " + age;
    }
}