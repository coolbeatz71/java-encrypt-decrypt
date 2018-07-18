import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DataWriter{

	public static void write( String text){

		try{

			BufferedWriter writer = new BufferedWriter( new FileWriter( new File("myOutput.txt")));
			writer.write(text);
			writer.flush();
			writer.close();
			System.out.println("Everything is done successfully!!");

		}
		catch(IOException e){

			e.printStackTrace();

		}

	}
}