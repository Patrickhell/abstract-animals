package org.java.lessons.classi.astratte;

import org.java.lessons.classi.Interface.Ivolante;
import org.java.lessons.classi.Interface.Inuotante;

public class Main {
	
	public static void main(String[] args) {
		
		//CREIAMO UN VUOVO OGGETTO DI OGNI TIPO CHE INSERIAMO NELLA VARIABILE c,p,a,d
		
		Cane c = new Cane();
		
		Passerotto p = new Passerotto();
		
		Aquila a = new Aquila();
		
		Delfino d = new Delfino();
		
		//CREIAMO UNA NUOVA ISTANZA O OGGETTO DI TIPO ANIMALE
		//CHE INSERIAMO IN UN ARRAY (ANIMALI) DI 4 ELEMENTI
		
		Animale[] animali = new Animale[4];
		animali[0] = c;
		animali[1] = p;
		animali[2] = a;
		animali[3] = d;
		
		for(int i = 0; i < animali.length; i++) {
		
			// AD OGNI ITERAZIONE DI I INSERIAMO NELLA VARIABILE A DI TIPO ANIMALE, L'OGGETTO PRESENTE
			// AD OGNI INDICE NELL'ARRAY 
			 
			Animale A = animali[i];
		    System.out.println(A.getClass().getSimpleName() + ":");
		    A.dormi();
		    A.verso();
		    A.mangia();
			
			// CONTROLLIAMO CHE LA VARIABILE A DI TIPO ANIMALE SIA UNA INSTANZA DELLE INTERFACCIE
		    
		    //IVOLANTE E INUOTANTE SE SI, IL METHODO FAIVOLANTE() ACCETTA COME ARGOMENTO AVOLANTE COSI
		    //COME IL METODO FAINUOTARE() ACCETTA ANUOTANTE;
			
			if(A instanceof Ivolante) {
				
				Ivolante Avolante = (Ivolante)A;
				
				faiVolare(Avolante);
			}
			
			if(A instanceof Inuotante) {
				
				Inuotante Anuotante = (Inuotante)A;
				
				faiNuotare(Anuotante);
			}
			
			System.out.println("--------------------");
			System.out.println("--------------------");
		}
		
		
	}
	
	// I METODI FAI-VOLANTE/NUOTANTE, VIENE RICHIAMATO IL QUALE RICHIAMA A SUA VOLTA IL METODO VOID NUOTA()/VOLA DI
	//CIASCUNA VARIABILE A DI TIPO ANIMALE CHE SONO DELLE ISTANZE DELLE INTERFACCIE INUOTANTE E IVOLANTE 
	//E "LI VA VOLARE O NUOTARE RESPETTIVAMENTE"
	
	public static void faiNuotare(Inuotante Anuotante) {
		
		Anuotante.nuota();
	}
	
    public static void faiVolare(Ivolante Avolante) {
		
		Avolante.vola();
	}
	

}
