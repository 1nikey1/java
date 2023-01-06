import java.util.*;
public class LittleToBig {
    public static void main(String[] args){
        char a;
        Scanner reader= new Scanner(System.in);
        a=reader.next().charAt(0);
        char b= (char) (a-32);
        System.out.println(b);
    }
}
