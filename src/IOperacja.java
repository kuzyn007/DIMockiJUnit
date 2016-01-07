import java.util.Vector;


public interface IOperacja {
	String pobierzTypOperacji();
	Vector<Double> pobierzArgumenty();
	void ustawWynik(Double wynik);
}
