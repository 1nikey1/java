import java.util.*;
public class RunNian {
    public static void main(String[] args) {
        int year;
        Scanner reader = new Scanner(System.in);
        year = reader.nextInt();
        if((year%4==0&&year%100!=0)||year%400==0)
        {
            System.out.println(year+"是闰年");
        }
        else System.out.println(year+"不是闰年" );
    }
}