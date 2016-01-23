import java.util.Vector;

public class WykonawcaOperacji {
	
	public void obliczaj(IOperacja obj) {
		if (obj.pobierzTypOperacji().equals("dodawanie")) {
			Vector<Double> vec = obj.pobierzArgumenty();
			Double wynik = 0.0;
			for (int i = 0; i < vec.size(); i++)
				wynik = wynik + vec.get(i);
			obj.ustawWynik(wynik);
		}
		
		if (obj.pobierzTypOperacji().equals("mnozenie")) {
			Vector<Double> vec = obj.pobierzArgumenty();
			Double wynik = 0.0;
			if(wynik == 0.0) {
				wynik = 1.0;
			}
			for (int i = 0; i < vec.size(); i++)
				wynik = wynik * vec.get(i);
			obj.ustawWynik(wynik);
		}
	}

}
