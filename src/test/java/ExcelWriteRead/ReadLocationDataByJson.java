package ExcelWriteRead;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.parser.ParseException;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ReadLocationDataByJson {
	
	
	static String path="D:\\Projects\\testng-master\\testng-master\\location.json";
	
	public static void main(String[] args) throws IOException, ParseException
	{
		
		FileReader file=new FileReader(path);
		
		JsonObject js=JsonParser.parseReader(file).getAsJsonObject();
		JsonObject location =js.getAsJsonObject("location");
		double lat=location.get("lat").getAsDouble();
		double lag=location.get("lng").getAsDouble();
		int acc=js.get("accuracy").getAsInt();
		String name=js.get("name").getAsString();
		String phNum=js.get("phone_number").getAsString();
		String add=js.get("address").getAsString();
		/*
		 * JSONParser parse=new JSONParser(); JSONObject jo=(JSONObject)
		 * parse.parse(file); JSONArray types=(JSONArray) jo.get("types"); String
		 * type1=(String) types.get(0); String type2=(String) types.get(1);
		 */
		
		
		
		
		System.out.println("Latitude :"+lat);
		System.out.println("Longitude :"+lag);
		System.out.println("Accuracy :"+acc);
		System.out.println("Name :"+name);
		System.out.println("Phone Number :"+phNum);
//		System.out.println("Type1 :"+type1);
//		System.out.println("Type2 :"+type2);
		JsonArray type=js.getAsJsonArray("types");
		System.out.println("Types :");
		for(Object obj:type)
		{
			System.out.println(obj);
		}
		
		
		
	}

}
