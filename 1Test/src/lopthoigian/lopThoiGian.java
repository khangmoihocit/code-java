package lopthoigian;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class lopThoiGian {
	public static void main(String[] args) {
		Date date = new Date(System.currentTimeMillis());
		DateFormat dfm = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		String s = dfm.format(date);
System.out.println(s);	}
}
