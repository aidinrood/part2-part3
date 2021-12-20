
public class Tracker {
	
	static int lineCounter=0;
	
	
	/**
	 * @return Total number of lines
	 */
	public static int getNoOfLines() {
		return lineCounter;
	}
	
	/**
	 * Increment line counter variable
	 */
	public static void incrementLineCounter() {
		lineCounter++;
	}
	
	/** Method that take
	 * @param line that contains all input data
	 * @return number of characters in that line
	 */
	public static int getNoOfChars(String line) {
		return (int) line.chars().count();
	}

}
