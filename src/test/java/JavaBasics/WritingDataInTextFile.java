package JavaBasics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingDataInTextFile {

	
	public static void main(String[] args) throws IOException
	{
		
		FileWriter file=new FileWriter("samplefile.txt");
	file.write("Akash Gupta");
	file.write("Peter parker");
	file.close();
		
		
		
	}
}
