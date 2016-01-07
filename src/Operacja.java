import java.util.Vector;


public class Operacja implements IOperacja {

	private String typOperacji;
	private Double wynik;
	private Vector<Double> vec;
	
	public Operacja(String a, Vector<Double> b) {
		typOperacji = a;
		vec = b;
		wynik = 0D;
	}
	
	public void ustawTypOperacji(String a) {
		typOperacji = a;
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
