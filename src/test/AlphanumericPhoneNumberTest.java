package test;

import static org.junit.Assert.*;
import org.junit.Test;
import main.AlphanumericPhoneNumber;

public class AlphanumericPhoneNumberTest {
	
	@Test
	public void vivoTest(){
		AlphanumericPhoneNumber apn = new AlphanumericPhoneNumber();
		assertEquals("8486", apn.execute("VIVO"));
	}
	
	@Test
	public void vivo2Test(){
		AlphanumericPhoneNumber apn = new AlphanumericPhoneNumber();
		assertEquals("#8486", apn.execute("#VIVO"));
	}
	
	@Test
	public void homeTest(){
		AlphanumericPhoneNumber apn = new AlphanumericPhoneNumber();
		assertEquals("1-4663-79338-4663", apn.execute("1-HOME-SWEET-HOME"));
	}
	
	@Test
	public void numberTest(){
		AlphanumericPhoneNumber apn = new AlphanumericPhoneNumber();
		assertEquals("0800-0000-1234", apn.execute("0800-0000-1234"));
	}
	
	@Test
	public void spaceTest(){
		AlphanumericPhoneNumber apn = new AlphanumericPhoneNumber();
		assertEquals("3656-33868", apn.execute("DOJO DEVMT"));
	}
	
	@Test
	public void lowerCaseTest(){
		AlphanumericPhoneNumber apn = new AlphanumericPhoneNumber();
		assertEquals("284222-40-47287", apn.execute("Cuiaba 40 graus"));
	}
	
	@Test
	public void trashTest(){
		AlphanumericPhoneNumber apn = new AlphanumericPhoneNumber();
		try {
			apn.execute("^][(&*@#$@#$%");
		} catch (IllegalArgumentException e) {
			assertEquals("Error: Invalid Number!", e.getMessage());
		}
	}
	
	
}


