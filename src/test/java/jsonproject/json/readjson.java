package jsonproject.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class readjson {

	public static void main(String[] args) throws IOException, ParseException {
		
		
		JSONParser jsonparser= new JSONParser();
		
		FileReader reader= new FileReader(".\\jsonfiles\\student.json");
		
		Object obj=jsonparser.parse(reader);
		JSONObject stdjsonobj=(JSONObject)obj;
		
		String fname=(String) stdjsonobj.get("Studentname");
		String lname=(String) stdjsonobj.get("lastname");
		String snumber=(String) stdjsonobj.get("studentno");
		String nation=(String) stdjsonobj.get("country");
		
		
		System.out.println(" "+fname);
		System.out.println(" "+lname);
		System.out.println(" "+snumber);
		System.out.println(" "+nation);
			

	}

}
