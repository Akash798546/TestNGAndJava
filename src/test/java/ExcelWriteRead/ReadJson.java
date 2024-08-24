package ExcelWriteRead;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class ReadJson {
    public static void main(String[] args) {
        String filePath = System.getProperty("user.dir") + "/testdata.json";
        
        try {
            // Create a FileReader object to read the JSON file
            FileReader fileReader = new FileReader(filePath);
            
            // Create a JSONParser object to parse the JSON data
            JSONParser jsonParser = new JSONParser();
            
            // Parse the JSON file into a JSONObject
            JSONObject jsonObject = (JSONObject) jsonParser.parse(fileReader);
            
            // Get the "Employee Details" array from the JSONObject
            JSONArray employeeDetails = (JSONArray) jsonObject.get("Employee Details");
            
            // Get the first JSONObject in the array
            JSONObject firstEmployee = (JSONObject) employeeDetails.get(1);
            
            // Extract the "company" value from the first JSONObject
            String company = (String) firstEmployee.get("company");
            String salary = (String) firstEmployee.get("salary");
            String Name = (String) firstEmployee.get("Name");
            
            
            // Print the first company value
            System.out.println(company);
            System.out.println(salary);
            System.out.println(Name);
            
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
