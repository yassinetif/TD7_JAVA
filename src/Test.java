

public class Test {
	public static void main(String[] args){
		Pays france=new Pays("France");
		Ville lemans= new Ville("Le Mans");
		Ville paris= new Ville("Paris");
		Personne yassine=new Personne("Yassine", "etudiant", 23, lemans);
		Personne enfant=new Personne("Bouboule", "enfant", 8, lemans);
		Personne luc=new Personne("luc", "etudiant", 21, lemans);
		Personne yann=new Personne("yann", "etudiant", 22, lemans);
		Personne Eliass=new Personne("Eliass", "etudiant", 24, lemans);
		Personne hollande=new Personne("hollande", "president", 61, paris);

		france.ajouteVille(lemans);
		france.ajouteVille(paris);

		System.out.println("Liste des personnes dominant le monde : " +Utils.personnesNom("Yassine",lemans.getHabitants()));
		System.out.println("Liste des personnes majeures au Mans : " +Utils.personnesMajeures(lemans.getHabitants()));
		
		if(Utils.existeProfession("president",paris.getHabitants()))
			System.out.println("Il y a un president a Paris");
		else
			System.out.println("Il n'y a aucun president a Paris");
			
		System.out.println("Liste des professions : " + Utils.professions(lemans.getHabitants()));
		System.out.println("Liste des habitants en France : " +france.getHabitants());
		System.out.println("Plus grosse ville de France : " +france.plusGrosseVille().getNom());
	}
}