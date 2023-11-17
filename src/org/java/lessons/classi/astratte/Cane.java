package org.java.lessons.classi.astratte;


import org.java.lessons.classi.Interface.Inuotante;

public class Cane extends Animale implements Inuotante{
	
	
	@Override
	public void verso() {
		
		System.out.println("abbaia");
	}

	public void mangia() {

		System.out.println("carne");
	}
	
	public void nuota() {
		
		System.out.println("Sto Nuotanto!!!");
	}
	

}
