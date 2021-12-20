import static org.junit.Assert.*;

import org.junit.Before;

public class Test {
	
	Tracker tracker= new Tracker();
	Reader reader=new Reader();
	

	@org.junit.Test
	public void testPrintValue() {
		reader.write("this is test results");
	}

	@org.junit.Test
	public void getNoOfChars() {
		assertEquals("Test No Of Chars ",4, tracker.getNoOfChars("zain"));
		
	}

	@org.junit.Test
	public void testGetLineCounter() {
		tracker.incrementLineCounter();
		assertEquals("Text Line counter ",1, tracker.getNoOfLines());
	}

	@org.junit.Test
	public void testIncrementLineCounter() {
		tracker.incrementLineCounter();
		tracker.incrementLineCounter();
        tracker.incrementLineCounter();
        assertEquals("Test Line counter ",4, tracker.getNoOfLines());
	}

}
;