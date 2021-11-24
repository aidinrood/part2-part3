
public class ClassTwo {

	static ClassOne class1;
	static int lineCounter=0;
	
	public static void main(String[] args) {
		
		class1=new ClassOne(); 			// Initializing ClassOne object
		class1.write("Welcome");		// print Welcome on console by calling class1 method
		
		String readLine="";	
		String line="";
		
		
		while(true) {					// while loop to continue read data from console
			readLine=class1.read();		// read console input into readLine String type variable
			if(readLine.toLowerCase().contains("stop")) {			// check if readLine contains 'stop' word or not
				readLine=readLine.substring(0, readLine.indexOf("stop"));	// if readLine contain 'stop' word then truncate the words after word 'stop'
				line+=readLine;			// add readLine to line String that will store all input Lines
				if(readLine.toLowerCase().startsWith("stop")) {		// check if readLine starts with stop so no need to increment line counter.
					break;				// break the loop
				}else {					// if readLine does not start with 'stop' word that means reaLine has some words before 'stop' so increment line counter 
					incrementLineCounter();	// incrementing line counter
					break;					// break the loop
				}
			}else {					// if the readLine does not contain 'stop' word 
				line+=readLine+" ";	// then add readLine to line and
				incrementLineCounter();//increment the Line counter
			}
			
		}
		
		class1.write("Input Data : "+line);								//Write all input data to console by calling class1 write method
		class1.write("Total # of Lines : "+getNoOfLines());				//Write the total numbers of line inputed by user on console
		class1.write("Total # of Characters : "+getNoOfChars(line));	//Write total numbers of characters inputed by user on console including spaces
			

	}
	
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
