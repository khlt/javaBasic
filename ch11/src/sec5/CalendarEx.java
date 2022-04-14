package sec5;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarEx {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		Calendar d = new GregorianCalendar(2022,3,14);	//날짜만 저장 가능한 그레고리안 형식의 날짜로 저장 0-11
		
		String str = date.toString();	//Calendar 객체를 String 객체로 변환
		Date now = d.getTime();	//Calendar 객체를 Date 객체로 변환
	
		Date e = new Date();	//Date 객체
		Calendar cal = Calendar.getInstance();	//Calendar 객체
		cal.setTime(e);	//Date객체를 Calendar객체로 변환하여 cal에 저장
		
		//Date 객체
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String date1 = sdf1.format(now);	//Date 객체
		String date2 = sdf2.format(now);
		System.out.println(date1);
		System.out.println(date2);
		
		int year = date.get(Calendar.YEAR);
		int month = date.get(Calendar.MONTH);
		int day = date.get(Calendar.DAY_OF_MONTH);
		int week = date.get(Calendar.DAY_OF_WEEK);
		int ampm = date.get(Calendar.AM_PM);
		int hour = date.get(Calendar.HOUR);
		int minute = date.get(Calendar.MINUTE);
		int second = date.get(Calendar.SECOND);
		System.out.println(year+"년 "+(month+1)+"월 "+day+"일 "+ampm+"\s"+hour+"\s"+minute+"\s"+second);
	}

}
