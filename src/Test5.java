import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Test5 {
	public static void main(String[] args)throws Exception {  
	    String testDateString2="9/28/2020 12:20:00 PM"; 
	    DateFormat df2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	    Date d2 = df2.parse(testDateString2);
        System.out.println("Date: " + d2);
        System.out.println("Date in dd-MM-yyyy HH:mm:ss format is: "+df2.format(d2));
	} 
}
