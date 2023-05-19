package com.mahjoub.PatternComposite;

/*
 * Mahjoub Messaoui
 */
public class Element extends Composants{

	@Override
	public void opperation() {
		String tab = "";
		for(int i =0; i<level;i++) 
			tab+="----";
			System.out.println(tab +"Element  " + nom);
		}
	

	
	public Element(String nom) {
		this.nom = nom;
	}
}
