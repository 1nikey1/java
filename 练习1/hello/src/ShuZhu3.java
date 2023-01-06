import java.util.Scanner;

public class ShuZhu3 {
    public static void main(String[] args){
        int [][] a;
        int n,i,j,sum=0;
        Scanner reader=new Scanner(System.in);
        n=reader.nextInt();
        a=new int [n][n];
        for (i=0;i<a.length;i++){
            for(j=0;j<a.length;j++)
                a[i][j]=reader.nextInt();
        }
        for(i=0;i<n;i++)
             sum+=a[i][n-1-i];
        System.out.println("sum"+"="+sum);
    }
}
