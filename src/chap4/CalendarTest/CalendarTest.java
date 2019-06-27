import java.time.*;

public class CalendarTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();   //当前时间
        int month = date.getMonthValue();   //当前月份
        int today = date.getDayOfMonth();     //当前月第几天

        date = date.minusDays(today - 1);   //月初第一天是哪一天
        DayOfWeek weekday = date.getDayOfWeek();    //月初第一天是周几 eg:SATURDAY
        int value = weekday.getValue();     //数字周几1-7 => 周一到周日

        System.out.println("Mon Tue Wen Thu Fri Sat Sun");
        for(int i  = 1; i < value; i ++) {
            System.out.print("    ");
        }

        while(date.getMonthValue() == month)
        {
            System.out.printf("%3d", date.getDayOfMonth());
            if(date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);
            if(date.getDayOfWeek().getValue() == 1) System.out.println();
        }
        if(date.getDayOfWeek().getValue() != 1) System.out.println();
    }
}
