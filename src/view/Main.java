package view;

import controller.FatorialController;

public class Main {
	
	public static void main(String[] args) {
		
		FatorialController fatorialController = new FatorialController();
		
		int resultado = fatorialController.fatorial(5);
		
		System.out.println(resultado);
	}

}
