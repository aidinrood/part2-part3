import static org.junit.Assert.*;

import org.junit.Before;

public class Test {
	
	ClassTwo class2= new ClassTwo();
	ClassOne class1=new ClassOne();
	

	@org.junit.Test
	public void testPrintValue() {
		class1.write("this is test results");
	}

	@org.junit.Test
	public void getNoOfChars() {
		assertEquals("Test No Of Chars ",4, class2.getNoOfChars("zain"));
		
	}

	@org.junit.Test
	public void testGetLineCounter() {
		class2.incrementLineCounter();
		assertEquals("Text Line counter ",1, class2.getNoOfLines());
	}

	@org.junit.Test
	public void testIncrementLineCounter() {
		class2.incrementLineCounter();
        class2.incrementLineCounter();
        class2.incrementLineCounter();
        assertEquals("Test Line counter ",4, class2.getNoOfLines());
	}

}
;