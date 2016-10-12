package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Rule;

public class CalculatorTest{
	
	@Test
	public void testEmptyString(){
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber(){
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumber(){
		assertEquals(3, Calculator.add("1,2"));
	}
	
	@Test
	public void testMultibleNumber(){
		assertEquals(15, Calculator.add("1,2,3,4,5"));
	}
	@Test
	public void testNewlineSplitNumber(){
		assertEquals(6, Calculator.add("1\n2,3"));
	}
	@Test(expected=IllegalArgumentException.class)
	public void throwsIllegalArgumentException(){
		Calculator.add("0,-1");
	}

	@Test(expected=IllegalArgumentException.class)
	public void throwsIllegalArgumentExceptionComparaMessages() throws Exception {
		try {
			Calculator.add("0,-1");
		} catch (IllegalArgumentException e){
			assertEquals("Negatives not allowed: -1"
					, e.getMessage());
			//throw e;
		}
	}

@Test(expected=IllegalArgumentException.class)
	public void throwsIllegalArgumentExceptionComparaMessagesMultibleNegatives() throws Exception {
		try {
			Calculator.add("0,-1,-5,-3,");
		} catch (IllegalArgumentException e){
			assertEquals("Negatives not allowed: -1,-5,-3"
					, e.getMessage());
			//throw e;
		}
	}


}





















































