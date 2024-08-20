package ExcelWriteRead;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.devtools.v123.audits.model.FederatedAuthRequestIssueReason;

public class ReadEmployeeJson {
	 static String filePath = System.getProperty("user.dir") + "/testdata.json";
	 
	 public static void main(String[] args) throws IOException, ParseException
	 {
	FileReader file=new FileReader(filePath);
	
	JSONParser jp=new JSONParser();
	JSONObject jo=(JSONObject) jp.parse(file);
	JSONArray empDetails=(JSONArray) jo.get("Employee Details");
	JSONObject firstCandidate= (JSONObject) empDetails.get(2);
	String name=(String) firstCandidate.get("Name");
	System.out.println(name);
	 
	 
	 
	 
	 }

}
