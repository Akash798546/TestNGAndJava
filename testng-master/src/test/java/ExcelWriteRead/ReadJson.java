package ExcelWriteRead;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJson {
	
	public static void main(String[] args) throws IOException, ParseException
	{
		String Filepath=System.getProperty("user.dir")+"/testdata.json";
		FileReader fr=new FileReader(Filepath);
		
		JSONParser jp=new JSONParser();
		JSONObject jb=(JSONObject) jp.parse(fr);
		System.out.println(jb.toJSONString());
	}

}
