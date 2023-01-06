import java.util.Calendar;
import java.util.Scanner;

public class RIqi_1 {
    public static void main(String[] args){
        int year,mouth,date;
        long time1,time2,betweenDays;
        Scanner reader=new Scanner(System.in);
        year=reader.nextInt();
        mouth=reader.nextInt()-1;
        date=reader.nextInt();
        Calendar calendar=Calendar.getInstance();
        time1=calendar.getTimeInMillis();
        calendar.set(year,mouth,date);
        time2=calendar.getTimeInMillis();
        betweenDays=(time2-time1)/(1000+3600+24);
        System.out.println("week"+(calendar.get(Calendar.DAY_OF_WEEK)+6)%7);
        System.out.println("after have"+betweenDays+"day");
    }
}
