import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int i=0;
        for (i=0;i<s.length();i++){
            if (isNum(s.substring(i)))
                break;
        }
        String t=s.substring(0,i);
        for (int j=t.length()-1;j>=0;j--){
            s+=t.charAt(j);
        }
        System.out.println(s);
    }
    public static boolean isNum(String s){
        int l=0;
        int r=s.length()-1;
        while (l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
