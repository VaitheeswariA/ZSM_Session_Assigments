package zohotask_Array;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class CountLines {

	static String file_location="C:\\Users\\Santhakumari\\Documents\\pgm11.java";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int line_Count=0;
		int word_Count=0;
		BufferedReader reader;
		try {
			reader=new BufferedReader(new FileReader(file_location));
			String current_line=reader.readLine();
			while(current_line!=null)
			{
				line_Count++;
				String words[]=current_line.split("\\s+");
				word_Count+=words.length;
				
				current_line=reader.readLine();
			}
			System.out.println("Total number of lines in the given file:"+line_Count);
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
	}

}
