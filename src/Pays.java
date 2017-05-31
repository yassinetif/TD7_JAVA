
/**
* @author LeNomDeLEtudiant
* @version 0.1 : Date : Tue Apr 11 17:09:50 CEST 2017
*
*/
import java.util.*;
import static java.util.stream.Collectors.toList;
public class Pays {
    private String nom;
    private List<Ville> villes;
    
    public Pays(String nom) {
        super();
        this.nom = nom;
        villes = new ArrayList<Ville>();
    }
    
    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }
    /**
     * @return the villes
     */
    public List<Ville> getVilles() {
        return villes;
    }
    
    public void ajouteVille(Ville v){
        this.villes.add(v);
    }
    
    public List<Personne> getHabitants(){
    	return villes.stream().map(Ville::getHabitants).flatMap(List::stream).collect(toList());
    }
    
    public Ville plusGrosseVille(){
    	return villes.stream().reduce((a,b) -> (a.getPopulation() > b.getPopulation())? a:b).get();
    }
	
}