package jsonproject.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class updatejson {

	public static void main(String[] args) throws IOException, ParseException {
		
		String path = "jsonfiles\\updatestudent.json" ;
		JSONParser json = new JSONParser();
		FileReader fir= new FileReader(path);
		JSONObject jsonObj2 = (JSONObject) json.parse(fir);
		jsonObj2.put("country", "usa");
		FileWriter file2 = new FileWriter("jsonfiles\\updatestudent.json",false);
		file2.write(jsonObj2.toJSONString());
		file2.close();

		System.out.println(jsonObj2.toString());


	}

}
