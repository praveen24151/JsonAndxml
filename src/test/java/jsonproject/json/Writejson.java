package jsonproject.json;

import java.io.FileWriter;
import java.io.IOException;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;

import org.json.simple.JSONObject;

public class Writejson {

	public static void main(String[] args) throws IOException, TransformerConfigurationException {
		// TODO Auto-generated method stub
		
		JSONObject obj= new JSONObject();
		
		
		obj.put("Studentname", "karan");
		obj.put("lastname", "ram");
		obj.put("Snumber", "85");
		obj.put("state", "bangalore");
		obj.put("age", "21");
		try {
			
		FileWriter file= new FileWriter(".\\jsonfiles\\studentwrite.json,");
		file.write(obj.toJSONString());
		
		file.close();
		  } catch (IOException e) {
		        
		         e.printStackTrace();
		  }      
		
		System.out.println("folder has been created");
	}

}
