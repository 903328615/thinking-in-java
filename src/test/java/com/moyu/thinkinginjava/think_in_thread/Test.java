package com.moyu.thinkinginjava.think_in_thread;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
/**
*时间生成
*/
public class Test {
    public static void main(String[] args) {
        System.out.println(getCurrentIntergerDateTime(5));
    }

    static List<Date> test(Date date) {
        Date start = dayStartDate(date);//转换为天的起始date
        Date nextDayDate = nextDay(start);//下一天的date

        List<Date> result = new ArrayList<Date>();
        while (start.compareTo(nextDayDate) < 0) {
            result.add(start);
            //日期加5分钟
            start = addFiveMin(start, 1);
        }

        return result;
    }

    private static Date addFiveMin(Date start, int offset) {
        Calendar c = Calendar.getInstance();
        c.setTime(start);
        c.add(Calendar.MINUTE, offset);
        return c.getTime();
    }

    private static Date nextDay(Date start) {
        Calendar c = Calendar.getInstance();
        c.setTime(start);
        c.add(Calendar.DATE, 1);
        return c.getTime();
    }

    private static Date dayStartDate(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.HOUR_OF_DAY, 0);
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime();
    }


    public static String getCurrentIntergerDateTime(int times){

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:00");
        Date date=new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, (int) -(90000/60000));
        calendar.add(Calendar.SECOND, (int) -(90000%60000)/1000);
        System.out.println(sdf.format(calendar.getTime()));
        int minute=calendar.get(Calendar.MINUTE);
        minute=(minute/times)*times;
        calendar.set(Calendar.MINUTE,minute);
        date=calendar.getTime();
        return sdf.format(date);
    }
}
