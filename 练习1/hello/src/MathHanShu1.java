import java.util.Scanner;

public class MathHanShu1 {
    public static void main(String[] args){
        int i,n;
        double pi,a,sum=0;
        Scanner reader=new Scanner(System.in);
        n=reader.nextInt();
        for(i=1;i<n;i++){
            a=i*i;
            sum+=1/a;
        }
        pi= Math.sqrt(6*sum);
        System.out.println(pi);
    }
}
