import com.sun.org.apache.xerces.internal.impl.dtd.models.DFAContentModel;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class text2 {
//    public static void main(String[] args) {
//        DateFormat dft=new SimpleDateFormat("YYYY-MM-DD");
//        try {
//            Date star=dft.parse("1949-10-01");
//            Date endDay=dft.parse("2022-01-01");
//            Date nextDay=star;
//            int i=0;
//            while(nextDay.before(endDay)){
//                Calendar cld=Calendar.getInstance();
//                cld.setTime(star);
//                cld.add(Calendar.DATE,1);
//                star=cld.getTime();
//                nextDay=star;
//                i++;
//            }
//            System.out.println(i);
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
//    }
    public static boolean isYear(int n){
        if(n%4==0&n%100!=0||n%400==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int res=31+31+30;
        for (int i=1950;i<2022;i++){
            if(isYear(i)){
                res+=366;
            }
            else{
                res +=365;
            }
        }
        System.out.println(res);
    }
}
