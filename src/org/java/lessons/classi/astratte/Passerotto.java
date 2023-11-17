package org.java.lessons.classi.astratte;

import org.java.lessons.classi.Interface.Ivolante;


public class Passerotto extends Animale implements Ivolante {
	
	@Override
	public void verso() {
		
		System.out.println("cinguetta");
	}

	public void mangia() {

		System.out.println("erba e vermi");
	}
	
	public void vola() {
		
		System.out.println("Sto volando!!!");
	}
	

}
