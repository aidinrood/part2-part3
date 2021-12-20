import java.util.Scanner;

public class Reader {
	
	static String readLine="";	
	static String line="";
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		while(true) {					// while loop to continue read data from console
			readLine= Reader.read();		// read console input into readLine String type variable
			if(readLine.toLowerCase().contains("stop")) {			// check if readLine contains 'stop' word or not
				readLine=readLine.substring(0, readLine.indexOf("stop"));	// if readLine contain 'stop' word then truncate the words after word 'stop'
				line+=readLine;			// add readLine to line String that will store all input Lines
				if(readLine.toLowerCase().startsWith("stop")) {		// check if readLine starts with stop so no need to increment line counter.
					break;				// break the loop
				}else {					// if readLine does not start with 'stop' word that means reaLine has some words before 'stop' so increment line counter 
					Tracker.incrementLineCounter();	// incrementing line counter
					break;					// break the loop
				}
			}else {					// if the readLine does not contain 'stop' word 
				line+=readLine+" ";	// then add readLine to line and
				Tracker.incrementLineCounter();//increment the Line counter
			}
		}
		
		Reader.write("Input Data : "+line);										//Write all input data to console by calling class1 write method
		Reader.write("Total # of Lines : "+Tracker.getNoOfLines());				//Write the total numbers of line inputed by user on console
		Reader.write("Total # of Characters : "+Tracker.getNoOfChars(line));	//Write total numbers of characters inputed by user on console including spaces
		
	}
	
	/**
	 * Method to read console input and
	 * @return	read value
	 */
	public static String read() {
		return input.nextLine();
	}
	
	/**
	 * Method that will take
	 * @param txt and print that to console
	 */
	public static void write(String txt) {
		System.out.println(txt);
	}

}
