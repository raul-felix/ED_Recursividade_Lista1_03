package controller;

public class FatorialController {
	
	public FatorialController() {
		super();
	}
	
	public int fatorial(int n) {
		
		if (n == 0) {
			// se n == 0, retornamos 1 já que o fatorial de 0 é 1 
			return 1;
		} else {
			// se não, retornamos n multiplicado pelo fatorial de (n - 1)
			// 5! = 5 * 4!
			// 4! = 4 * 3! etc
			return n * fatorial(n - 1);
		}
	}

}
