package com.mahjoub.PatternComposite;

import java.util.ArrayList;
import java.util.List;


/*
 * Mahjoub Messaoui
 */


public class Composite extends Composants{
	
	List<Composants> composants = new ArrayList<Composants>();

	@Override
	public void opperation() {
	 String tab = "";
		for (int i = 0; i < level; i++) 
			tab += "----";
			System.out.println(tab + "Composite" + nom);
			for (Composants c : composants) {
				c.opperation();

			}
		}
	
	
	public void addComposant(Composants c) {
		this.level = c.level+1;
		composants.add(c);
	}
	
	public void removeComposant(Composants c) {
		composants.remove(c);
	}

	
	public List<Composants> getAllComposants() {
		return composants;
	}

    public Composite(String nom) {
    	this.nom=nom;
    	
    }
	
	
}
