package pglp_4_1;

import static org.junit.Assert.*;

import org.junit.Test;

import java.time.LocalDate;
import java.util.HashSet;

import org.junit.Before;

public class PersonnelTest {

	private Personnel p1;
	private Personnel p2;
	
	@Before
	public void initTest()
	{
		LocalDate date = LocalDate.of(1994, 06, 03);
		HashSet<NumeroTelephone> tel = new HashSet<NumeroTelephone>();
		tel.add(new NumeroTelephone("0156668965"));
		tel.add(new NumeroTelephone("0669133742"));
		
		p1 = new Personnel.Builder("Hubert", "Bonisseur de La Bath").build();
		p2 = new Personnel.Builder("Noel", "Flantier").poste("Eleveur").datedenaissance(date).telephone(tel).build();
	}
	
	@Test
	public void BuilderDefaultTest()
	{
		String test = "Hubert Bonisseur de La Bath null "+ LocalDate.now() + " 0000000000; ";
		assertEquals(p1.toString(),test);
	}
	@Test
	public void BuilderCompletTest()
	{
		String test = "Noel Flantier Eleveur 1994-06-03 0156668965; 0669133742; ";
		assertEquals(p2.toString(),test);
	}

}
