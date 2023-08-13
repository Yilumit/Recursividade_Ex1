package view;
//	Somatória dos N primeiros números naturais

import controller.SomaController;

public class Principal_Soma {

	public static void main(String[] args) {
		int nNatural = 11;
		SomaController somar = new SomaController();
		
		int somaNaturais = somar.somatoria(nNatural);
		System.out.println(somaNaturais);

	}
	
}
