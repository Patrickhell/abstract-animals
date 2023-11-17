package org.java.lessons.classi.astratte;

import org.java.lessons.classi.Interface.Inuotante;

public class Delfino extends Animale implements Inuotante{
	

    @Override
	
    public void verso() {
	
	    System.out.println("scoppietta");
    }

    public void mangia() {

	    System.out.println("pesci volanti");
    }

    public void nuota() {
	
	    System.out.println("Sto Nuotando!!!");
    }

}
