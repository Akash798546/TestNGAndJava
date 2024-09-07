package JavaBasics;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfString {

    public static void main(String[] args) {
        String str = "Java is a programming language and java is object oriented";
        
        // Split the string into words
        String[] words = str.split("\\s+");
        Map<String,Integer> map=new HashMap<>();
        

      for(String st:words)
      {
    	  String lowercase=st.toLowerCase();
    	  map.put(lowercase, map.getOrDefault(lowercase,0)+1);
    	  
      }
      for(Map.Entry<String, Integer> entry:map.entrySet())
      {
    	  System.out.println(entry.getKey()+"  : "+entry.getValue());
//    	  if(entry.getValue().equals(2)) {
//    		  System.out.println(entry.getKey()+"  : "+entry.getValue());
//    	  }
      }
      
    }
}
