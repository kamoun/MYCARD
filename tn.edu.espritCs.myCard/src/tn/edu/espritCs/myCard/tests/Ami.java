package tn.edu.espritCs.myCard.tests;

public class Ami {
private String prenom;
private String nom;
private String couleur; 
private boolean homme;
private String sport;
public Ami() {
	super();
	// TODO Auto-generated constructor stub
}

public Ami(String prenom, String nom, String couleur, boolean homme, String sport) {
	super();
	this.prenom = prenom;
	this.nom = nom;
	this.couleur = couleur;
	this.homme = homme;
	this.sport = sport;
}

public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getCouleur() {
	return couleur;
}
public void setCouleur(String couleur) {
	this.couleur = couleur;
}
public boolean getHomme() {
	return homme;
}
public void setHomme(boolean homme) {
	this.homme = homme;
}
public String getSport() {
	return sport;
}
public void setSport(String sport) {
	this.sport = sport;
}

}
