import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import static org.mockito.Mockito.*;


public class Tests {
	
//TESTOWANIE KLASY OPERACJA
	
	/*private Operacja test;
	public Operacja test() {
		Vector<Double> v = new Vector<Double>();
		v.add(1.1);
		v.add(1.1);
		v.add(1.1);
		
		test = new Operacja("test", v);
		
		return test;
	}*/
	
	@Test
	public void testOperacja() {
		Vector<Double> v = new Vector<Double>();
		v.add(1.1);
		v.add(1.1);
		v.add(1.1);
		
		Operacja test = new Operacja("test", v);
	}

	@Test
	public void testUstawTypOperacji() {
		Vector<Double> v = new Vector<Double>();
		v.add(1.1);
		v.add(1.1);
		v.add(1.1);
		
		Operacja test = new Operacja("test", v);
		
		test.ustawTypOperacji("aa");
		assertEquals(test.pobierzTypOperacji(), "aa");
	}

	@Test
	public void testPobierzTypOperacji() {
		Vector<Double> v = new Vector<Double>();
		v.add(1.1);
		v.add(1.1);
		v.add(1.1);
		
		Operacja test = new Operacja("test", v);
		
		assertEquals(test.pobierzTypOperacji(), "test");
	}

	@Test
	public void testUstawArgumenty() {
		Vector<Double> v = new Vector<Double>();
		v.add(1.1);
		
		Operacja test = new Operacja("test", v);

		Vector<Double> vExpect = new Vector<Double>();
		vExpect.add(1.5);
		vExpect.add(2.1);
		
		Vector<Double> vResult = new Vector<Double>();
		vResult.add(1.5);
		vResult.add(2.1);
		
		test.ustawArgumenty(vResult);
		assertEquals(vExpect,vResult);
	}

	@Test
	public void testPobierzArgumenty() {
		Vector<Double> v = new Vector<Double>();
		v.add(1.1);
		
		Operacja test = new Operacja("test", v);
		
		assertEquals(v, test.pobierzArgumenty());
	}

	@Test
	public void testUstawWynik() {
		Vector<Double> v = new Vector<Double>();
		v.add(1.1);
		
		Operacja test = new Operacja("test", v);
		
		test.ustawWynik(0.0005);
		assertEquals(test.pobierzWynik(),(double) 0.00051, 0.0001);
		test.ustawWynik(0.1205);
		assertEquals(test.pobierzWynik(),(double) 0.12051, 0.0001);
	}

	@Test
	public void testPobierzWynik() {
		Vector<Double> v = new Vector<Double>();
		v.add(1.1);
		
		Operacja test = new Operacja("test", v);
		
		assertEquals(test.pobierzWynik(),(double) 0.0, 0.0001);
	}

//TESTOWANIE KLASY WYKONAWCAOPERACJI
	@Test
	public void testObliczaj() {
		Vector<Double> v = new Vector<Double>();
		v.add(1.2);
		v.add(1.3);
		
		IOperacja ref = mock(IOperacja.class);
		when(ref.pobierzArgumenty( )).thenReturn(v);
		
		WykonawcaOperacji test = new WykonawcaOperacji();
		
		when(ref.pobierzTypOperacji( )).thenReturn("dodawanie");
		test.obliczaj(ref);
		verify(ref, times(1)).ustawWynik(2.5);
		
		when(ref.pobierzTypOperacji( )).thenReturn("mnozenie");
		test.obliczaj(ref);
		verify(ref, times(1)).ustawWynik(1.56);
		
	}
	
}
