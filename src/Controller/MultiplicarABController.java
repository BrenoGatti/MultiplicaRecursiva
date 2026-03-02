package Controller;

public class MultiplicarABController {

	public MultiplicarABController() {
		super();
	}
	public int multiplicarAB (int a, int b) {
		if (b == 0) {
			return 0;
		} else {
			return a + multiplicarAB(a, b -1);
		}
	}
}
