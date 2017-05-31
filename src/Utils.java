
import java.util.*;
import static java.util.stream.Collectors.toList;


public class Utils {

	
		public static List<Personne> personnesNom(String nom, List<Personne> lstPers){
			List<Personne> pers=lstPers.stream().filter(n->n.getNom().equals(nom))
										.collect(toList());
			return pers;
		}
		
		public static List<Personne> personnesMajeures(List<Personne> lstPers){
			List<Personne> pers = lstPers.stream().filter(n->n.getAge() > 17)
												.collect(toList());
			return pers;
		}
		
		public static boolean existeProfession(String profes, List<Personne> lstPers){
			return (lstPers.stream().anyMatch((Personne n) -> n.getProfession().equals(profes)));
				
		}
		
		public static List<String> professions(List<Personne> lstPers){
			return lstPers.stream().map(Personne::getProfession).distinct().sorted().collect(toList());
	
		}
		
}
