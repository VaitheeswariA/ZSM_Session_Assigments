package zohotask_Array;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file =new File("C:\\Users\\Santhakumari\\Documents\\pronic_prime.java");
		File output_file=new File("C:\\Users\\Santhakumari\\Documents\\pronic_prime_Copy.java");
		System.out.println(copy(file,output_file));
	}
	
	public static File copy(File file,File output_file)
	{
		
		
		FileInputStream file_input=null;
		FileOutputStream file_output=null;
		
		try {
			 file_input=new FileInputStream(file);
			 file_output=new FileOutputStream(output_file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			System.out.println(file_input.available());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int words=0;
		try {
			while((words=file_input.read())!=-1)
			{
				file_output.write(words);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally
		{
			if(file_input!=null)
			{
				try {
					file_output.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(file_output!=null)
			{
				try {
					file_output.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return output_file;
	}

}
