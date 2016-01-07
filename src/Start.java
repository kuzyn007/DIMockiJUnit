import java.util.*;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Double> a = new Vector<Double>();
		for(int i =0 ; i<10;i++) {
			a.add(i*(0.1*i));
		}
		
		WykonawcaOperacji ref = new WykonawcaOperacji();
		Operacja ref2 = new Operacja("dodawanie", a);
		Dodawanie ref3 = new Dodawanie(a);
		ref.obliczaj(ref2);
		ref.obliczaj(ref3);
		System.out.println(ref2.pobierzWynik());
		System.out.println(ref3.pobierzWynik());
		
	}

}
