package colin.test;

/*
 * http://www.w3cschool.cc/java/java-date-time.html
*/
import java.util.Date;

public class TestDate {
	
	TestDate(){
		Date d = new Date();		
		System.out.println(d.getTime());
		System.out.println(d.toString());
	}
}
