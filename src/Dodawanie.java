import java.util.Vector;


public class Dodawanie implements IOperacja {

	private String typOperacji;
	private Double wynik;
	private Vector<Double> vec;
	
	public Dodawanie(Vector<Double> b) {
		typOperacji = "dodawanie";
		vec = b;
		wynik = 0D;
	}
	
	public String pobierzTypOperacji() {
		return typOperacji;
	}

	public void ustawArgumenty(Vector<Double> vec) {
		this.vec = vec;
	}
	
	public Vector<Double> pobierzArgumenty() {
		return vec;
	}

	public void ustawWynik(Double wynik) {
		this.wynik = wynik;
	}
	
	public Double pobierzWynik() {
		return wynik;
	}

}
