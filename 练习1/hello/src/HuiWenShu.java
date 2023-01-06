import java.util.*;
public class HuiWenShu {
    public static void main(String[] args){
        int a,g,s,b,q,w;
        System.out.println("please input 5 number");
        Scanner reader=new Scanner(System.in);
        a=reader.nextInt();
        g=a%10;
        s=(a/10)%10;
        b=(a/100)%10;
        q=(a/1000)%10;
        w=a/10000;
        if(g==w&&s==q){
            System.out.println(a+" is huiwenshu");
        }
        else
            System.out.println(a+" isn't a huiwenshu");
    }
}
