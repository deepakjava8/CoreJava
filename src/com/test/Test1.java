package com.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Test1 implements Cloneable{
	@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}
public static void main(String[] args) throws Exception {
	String updateSnEventDate = updateSnEventDate("03/01/2021 12:05:00 PM", "+05:00");
												// "02/24/2021 9:05:00"
												//2/24/2021 9:05:00 PM
	System.out.println(updateSnEventDate);
	DateFormat format = new SimpleDateFormat("MM/d/yyyy h:mm:ss a");
	Date date = format.parse(updateSnEventDate);
	System.out.println(date);

	
}
static String updateSnEventDate(String inputDate, String timeZone) {

	String outputDate = null;
	try {
		DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss a");

		LocalDateTime localDateTime = LocalDateTime.parse(inputDate, inputFormat);

		ZonedDateTime zdtMYT = localDateTime.atZone(ZoneId.of(timeZone));

		TimeZone tz = TimeZone.getTimeZone("America/Chicago");

		String offset = String.format("%02d:%02d", Math.abs(tz.getOffset(Calendar.ZONE_OFFSET) / 3600000),
				Math.abs((tz.getOffset(Calendar.ZONE_OFFSET) / 60000) % 60));

		offset = (tz.getOffset(Calendar.ZONE_OFFSET) >= 0 ? "+" : "-") + offset;

		ZonedDateTime zdtCST = zdtMYT.withZoneSameInstant(ZoneId.of(offset));

		outputDate = zdtCST.format(inputFormat);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return outputDate;
}

/*public static Date getReceiptDate(GloviaAccRcptMsg gloviaAccRcptMsg) throws Exception {
	String receiptDate="";
	Date date=null;
	List<Items> items = gloviaAccRcptMsg.getItems();

	if(items!=null) {	
		for(Items item : items) {
			receiptDate = item.getReceiptDate();
			break;
		}
	}
		if(StringUtils.hasText(receiptDate)) {
			DateFormat format = new SimpleDateFormat("MM/d/yyyy h:mm:ss a");
			date = format.parse(receiptDate);
		}
	return date;
}*/

}
