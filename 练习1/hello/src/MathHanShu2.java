import java.util.Scanner;

public class MathHanShu2 {
    public  static void main(String[] args){
        String str;
        char ch;
        int count=0;
        Scanner reader=new Scanner(System.in);
        str=reader.nextLine();
        ch=reader.next().charAt(0);
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i))
                count++;
        }
        System.out.println(count);
    }
}
