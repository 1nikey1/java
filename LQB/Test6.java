import java.util.Scanner;

import java.util.Scanner;
public class Test6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        long c=sc.nextLong();
        long s=sc.nextLong();
        double v=t*1.0/c;
        s-=c;
        double cnt=s*v;
        if(cnt-(int)cnt>0){
            System.out.println((int) cnt + 1);
        }
        else
            System.out.println((int) cnt );
    }
}

