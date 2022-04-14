package sec5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		String date1 = sdf1.format(now);
		String date2 = sdf2.format(now);
		
		System.out.println(date1);
		System.out.println(date2);
		
		int year = now.getYear();
		int month =now.getMonth();
		int day =now.getDay();
		int hour =now.getHours();
		int minute =now.getMinutes();
		int second =now.getSeconds();
		int week =now.week();
	}
}
