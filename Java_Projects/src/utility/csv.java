package utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class csv {
	
	public static List<String[]> read(String file){
		List<String[]> data = new LinkedList<String[]>();
		String datarow;
		
		try {
		
		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader(file));
		while((datarow = br.readLine())!=null) {
			String[] dr = datarow.split(",");
			data.add(dr);
			}
		}
		catch(FileNotFoundException fe) {
			System.out.println("FILE NOT FOUND");
			fe.printStackTrace();
		}
		catch(IOException e) {
			System.out.println("Input Output Exception");
			e.printStackTrace();
		}
		
		 
		
		return data;
	}

}
