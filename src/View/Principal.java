package View;

import Controller.MultiplicarABController;

public class Principal {

	public static void main(String[] args) {
		MultiplicarABController multiplicarABController = new MultiplicarABController();
		int a = 0;
		int b = 5;
		int resultado = multiplicarABController.multiplicarAB(a, b);
		System.out.println(resultado);

	}

}
