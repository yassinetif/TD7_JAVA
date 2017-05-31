/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Tue Apr 11 17:10:08 CEST 2017
*
*/
import java.util.*;

public class Ville {
    private String nom;
    private List<Personne> habitants;
    
    public Ville(String nom) {
        super();
        this.nom = nom;
        habitants = new ArrayList<Personne>();
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }
    
    /**
     * @return the habitants
     */
    public List<Personne> getHabitants() {
        return habitants;
    }

    
public int getPopulation(){
        return habitants.size();
    }

    public void ajouteHabitant(Personne p){
        this.habitants.add(p);
    }

}