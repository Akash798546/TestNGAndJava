package ExcelWriteRead;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ReadLocationDataByJson {
	
	
	static String path="D:\\Projects\\testng-master\\testng-master\\location.json";
	
	public static void main(String[] args) throws IOException, ParseException
	{
	
		FileReader file=new FileReader(path);
		JsonObject jo=JsonParser.parseReader(file).getAsJsonObject();
		JsonObject location=jo.getAsJsonObject("location");
		double lat=location.get("lat").getAsDouble();
		double lon=location.get("lng").getAsDouble();
		String accuracy=jo.get("accuracy").getAsString();
		String name=jo.get("name").getAsString();
		String mobile=jo.get("phone_number").getAsString();
		JsonArray type=jo.getAsJsonArray("types");
		
		System.out.println("Latitude : "+lat);
		System.out.println("Longitude : "+lon);
		System.out.println("Accuracy : "+accuracy);
		System.out.println("Name : "+name);
		System.out.println("Mobile : "+mobile);
		System.out.print("Types: ");
		for(JsonElement str:type)
		{
			if(str.getAsString().equals("shoe park"))
			{
			System.out.println(str);
			}
		}
		
		
		
		
	}

}
