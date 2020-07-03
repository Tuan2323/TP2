import java.util.*;

public class Salarie {
//	public class Commercial extends Salarie {

//	}
	private int m_nMatricule;
	private int m_nCategorie;
	private int m_nService;
	private String m_strNom;
	private double m_dSalaire;
	private static int nbInstance;
	
	public Salarie()
	{
		nbInstance++;
	}
	public Salarie (int m_nMatricule,int m_nCategorie,int m_nService, String m_strNom, double m_dSalaire)
	{
		if(m_nCategorie<0) {
			throw new IllegalArgumentException("Interdit");
		}else this.m_nCategorie=m_nCategorie;
		
			this.m_nMatricule= m_nMatricule;
		this.m_nService=m_nService;
		this.m_strNom=m_strNom;
		this.m_dSalaire=m_dSalaire;
		nbInstance++;
	}
	
	public static int getNombreInstance()
	{
		return nbInstance;
	}
	
	public int getM_nMatricule() {
		return m_nMatricule;
	}

	public void setM_nMatricule(int m_nMatricule) {
		this.m_nMatricule = m_nMatricule;
	}
	public int getM_nCategorie() {
		return m_nCategorie;
	}

	public void setM_nCategorie(int m_nCategorie) {
		if(m_nCategorie!=1&&m_nCategorie!=2&&m_nCategorie!=3) {
			throw new IllegalArgumentException("Interdit");
		}
		else this.m_nCategorie = m_nCategorie;
	}

	public String getM_strNom() {
		return m_strNom;
	}

	public void setM_strNom(String m_strNom) {
		this.m_strNom = m_strNom;
	}

	public int getM_nService() {
		return m_nService;
	}

	public void setM_nService(int m_nService) {
		if(m_nService>0) this.m_nService = m_nService;
		else System.out.println("erreur");
	}

	public double getM_dSalaire() {
		return m_dSalaire;
		
	}

	public void setM_dSalaire(double m_dSalaire) throws IllegalArgumentException
	{
		if(m_dSalaire<0) {
			throw new IllegalArgumentException("Interdit");
		}
		else this.m_dSalaire = m_dSalaire;
	}
	
	 public void calculSalaire() {
		
		System.out.println("Le salaire de "+getM_strNom()+" est de "+getM_dSalaire());
	}
	public void affiche() {
		
		System.out.println(+getM_nMatricule());
	}
	public boolean equals(Salarie o) {
		if (m_nMatricule==o.m_nMatricule && m_strNom==o.m_strNom)
		{
			return true;
		}return false;
	}
	
	public String toString() {
		return " "+this.m_nMatricule+" , "+this.m_nCategorie+" , "+this.m_nService+","+this.m_strNom+","+this.m_dSalaire;
	}
}
