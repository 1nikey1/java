import java.util.*;
public class QiuHePingJun{
    public static void main(String[] args){
        int a,sum=0,n ;
        double avg=0;
        Scanner reader=new Scanner(System.in);
        System.out.println("please input 10 number");
        for(n=0;n<10;n++)
        {
            a=reader.nextInt();
            sum+=a;
        }
        avg=sum/10;
        System.out.println(sum+" "+avg);

    }
}