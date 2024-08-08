package ExcelWriteRead;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonTest {
	
	public static void main(String[] args)
	{
		JSONObject obj1=new JSONObject();
		obj1.put("Name", "Akash");
		obj1.put("company", "TIL");
		obj1.put("salary", "25000");
		
		JSONObject obj2=new JSONObject();
		obj2.put("Name", "Aryan");
		obj2.put("company", "wipro");
		obj2.put("salary", "20000");
		
		JSONArray ja=new JSONArray();
		ja.add(obj1);
		ja.add(obj2);
		
		JSONObject js=new JSONObject();
		js.put("Employee Details", ja);
		System.out.println(js.toJSONString());
	}

}
