package JavaBasics;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DemonstrateIndexOf {
	
	

		public static void main(String args[]) throws IOException, ParseException {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the input string:");
//		String inputString = sc.nextLine();
//		System.out.println("Enter the sub string:");
//		String subString = sc.nextLine();
//		int index = inputString.indexOf(subString);
//		System.out.println("Index of sub string is: " + index);
//		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(df.format(now));
		
		
		long millis=System.currentTimeMillis();
		java.sql.Date date=new java.sql.Date(millis);
		System.out.println(date);
		
		
			String sDate="01/01/2020";
			Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
			System.out.println(sDate+"\t"+date1);
		
//		Runtime.getRuntime().exec("notepad");
		}
		}


