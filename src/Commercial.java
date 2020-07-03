

public class Commercial extends Salarie {
private double m_dChiffreAffaire;
private int m_pcCommission;
private int m_nMatricule;
private int m_nCategorie;
private int m_nService;
private String m_strNom;
private double m_dSalaire;


public Commercial (int m_nMatricule,int m_nCategorie,int m_nService, String m_strNom, double m_dSalaire){
	super(m_nMatricule,m_nCategorie,m_nService,m_strNom,m_dSalaire);
}

public Commercial (int m_nMatricule,int m_nCategorie,int m_nService, String m_strNom, double m_dSalaire,double m_dChiffreAffaire, int m_pcCommission){
	super(m_nMatricule,m_nCategorie,m_nService,m_strNom,m_dSalaire);
	this.m_nMatricule= m_nMatricule;
	this.m_nCategorie=m_nCategorie;
	this.m_nService=m_nService;
	this.m_strNom=m_strNom;
	this.m_dSalaire=m_dSalaire;
this.m_dChiffreAffaire=m_dChiffreAffaire;
this.m_pcCommission=m_pcCommission;
}
public double getM_dChiffreAffaire() {
	return m_dChiffreAffaire;
}
public void setM_dChiffreAffaire(double m_dChiffreAffaire) {
	this.m_dChiffreAffaire = m_dChiffreAffaire;
}
public int getM_pcCommission() {
	return m_pcCommission;
}
public void setM_pcCommission(int m_pcCommission) {
	this.m_pcCommission = m_pcCommission;
}
public double getM_dSalaire() {
	return m_dSalaire;
}

public void setM_dSalaire(double m_dSalaire) {
	this.m_dSalaire = m_dSalaire;
}
public int getM_nMatricule() {
	return m_nMatricule;
}
public void setM_nMatricule(int m_nMatricule) {
	this.m_nMatricule = m_nMatricule;
}

public String getM_strNom() {
	return m_strNom;
}

public void setM_strNom(String m_strNom) {
	this.m_strNom = m_strNom;
}

@Override
public void calculSalaire()  {
	double sal= getM_dSalaire()+((getM_dChiffreAffaire()*getM_pcCommission())/100);
	System.out.println("Le salaire de "+getM_strNom()+" est de "+sal);
}

}