package com.mahjoub.PatternComposite;

/*
 * Mahjoub Messaoui
 */

public class App 
{
    public static void main( String[] args )
    {
        Composite racine = new Composite("Composite1");
        Composite composite2 = new Composite("Composite2");
      
        racine.addComposant(new Element("Element11"));
        racine.addComposant(new Element("Element12"));
        racine.addComposant(new Element("Element13"));
        composite2.addComposant(new Element("Element21"));
        composite2.addComposant(new Element("Element22"));
        racine.addComposant(composite2);
        racine.opperation();
    }
}
