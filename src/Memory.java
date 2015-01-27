import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;


public class Memory {
	
	private int pageNumber, offset; 
	private HashMap<Integer, Integer> RAM;
	private BufferedReader fileInput;
	
	public Memory(){
		HashMap<Integer, Integer>  map = new HashMap<Integer, Integer>();
	}
	
	public void loadInputFile(){
		try {
			fileInput = new BufferedReader(new FileReader("InputFile.txt"));
			String line = fileInput.readLine();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}
