package org.java.lessons.classi.astratte;

import org.java.lessons.classi.Interface.Ivolante;
import org.java.lessons.classi.Interface.Inuotante;

public class Aquila extends Animale implements Ivolante, Inuotante{
	

	
@Override
public void verso() {
	
	System.out.println("Strida");
}

public void mangia() {

	System.out.println("carne e vermi");
}

public void vola() {
	
	System.out.println("Sto volando!!!");
}

public void nuota() {
	
	System.out.println("Sto Nuotanto!!!");
}
	
	
}
