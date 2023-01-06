import java.util.NavigableSet;
import java.util.Scanner;

public class HanShu_1 {
    public static void main(String[] args){
        int n;
        String s;
        Scanner reader=new Scanner(System.in);
        n=reader.nextInt();
        s=Doth(n);
        System.out.println(s);
    }
    public static String Doth(int n){
        StringBuffer s=new StringBuffer(" ");
        int t;
        do{
            t=n%16;
            if(t<10)
                s.insert(0,t);
            else
                s.insert(0,t-10+"a");
            n=n/16;
        }
        while (n!=0);
        return s.toString();
    }
}
