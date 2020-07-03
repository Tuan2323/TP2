import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Application {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		  Salarie s1= new Salarie(4002,2,1,"Tuan",1000); 
		  Salarie s2= new Salarie(4000,2,1,"Micka",2000); 
	
		
		  Salarie s3= new Salarie(4002,2,1,"Tuan",2000); 
		  Salarie s4= new Salarie(4001,2,1,"Ezdin",9000); 
		  Salarie s5= new Salarie(4003,2,1,"Skander",4000);
		 
		
		Commercial c1 = new Commercial(2000,1,2,"Abdou",3000,10000,5); 
		Commercial c2 = new Commercial(2001,1,2,"Anouch",5000,50000,5);
		
s1.affiche();
s1.calculSalaire();
System.out.println(s1.toString());
System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3));
s2.calculSalaire();
try {
	s2.setM_dSalaire(1000);
	
} catch (IllegalArgumentException e) {
	System.err.println(e.getMessage());
}
try {
	
	s1.setM_nCategorie(4);
} catch (IllegalArgumentException e) {
	System.err.println(e.getMessage());
}
s2.calculSalaire();
System.out.println(+Salarie.getNombreInstance());
c1.calculSalaire();
c1.setM_dSalaire(8000);
c1.calculSalaire();


Hashtable<Integer,String> h1 = new Hashtable<Integer,String>();

h1.put(s1.getM_nMatricule(),s1.getM_strNom());
h1.put(s2.getM_nMatricule(),s2.getM_strNom());
h1.put(s3.getM_nMatricule(),s3.getM_strNom());
h1.put(s4.getM_nMatricule(),s4.getM_strNom());
h1.put(s5.getM_nMatricule(),s5.getM_strNom());
h1.put(c1.getM_nMatricule(),c1.getM_strNom());
h1.put(c2.getM_nMatricule(),c2.getM_strNom());


h1.forEach((key, value)->System.out.println("Matricule : "+key+"| Nom : "+value));
String n = h1.get(s1.getM_nMatricule());
System.out.println(n);

System.out.println(h1.get(s2.getM_nMatricule()));
  System.out.println(h1);
  
  
 s1.calculSalaire();
  c1.calculSalaire();
  
		}catch(IllegalArgumentException e) {
			System.err.println(e.getMessage());
		} 
		
 // calculSalaire(s1);


}}
