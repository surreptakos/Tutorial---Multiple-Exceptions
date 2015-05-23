import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;


public class App {

	public static void main(String[] args) {
		Test test = new Test();
		
		/*
		try {
			test.run();
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		*/
	
		/*
		try {
			test.run();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("Couldn't parse command file.");
		}
		*/
		
		try {
			test.run();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			test.input();
			
			//FileNotFoundException must be checked first bc
			// it is a child class of IOException
		} catch (FileNotFoundException e) {
			//If FileNotFoundException were checked after IOException,
			// this code would be unreachable
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
