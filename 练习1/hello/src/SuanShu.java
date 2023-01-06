import java.util.*;
public class SuanShu {
    public static void main(String[] args){
        int a,b,sum,jian,chen;
        double chu;
        Scanner reader=new Scanner(System.in);
        a=reader.nextInt();
        b=reader.nextInt();
        sum=a+b;
        jian=a-b;
        chen=a*b;
        chu=(double) a/b;
        System.out.println(sum+"\t");
        System.out.println(jian+"\t");
        System.out.println(chen+"\t");
        System.out.println(chu+"\n");
        }
    }

