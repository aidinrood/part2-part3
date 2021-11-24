import java.util.Scanner;

public class ClassOne {
	Scanner input=new Scanner(System.in);

	public String read() {
		return input.nextLine();
	}
	
	public void write(String txt) {
		System.out.println(txt);
	}
}
