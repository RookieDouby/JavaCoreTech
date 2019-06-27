package chap4.CalendarTest;
import java.time.*;

public class CalendarTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();   //当前时间
        int month = date.getMonthValue();   //当前月份
        int today = date.getDayOfMonth();     //当前月第几天

        date = date.minusDays(today - 1);   //月初第一天是哪一天
        DayOfWeek weekday = date.getDayOfWeek();    //月初第一天是周几 eg:SATURDAY
        int value = weekday.getValue();     //数字周几1-7 => 周一到周日

        System.out.println(date);
        System.out.println(weekday);


    }
}
