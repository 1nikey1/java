import java.util.*;
public class ShuZhu1 {
    public static void main(String[] args){
        int []num,a;
        int i,j,temp,max;
        num=new int[5];
        a=new int[5];
        Scanner reader=new Scanner(System.in);
        for(i=0;i<a.length;i++){
            num[i]=reader.nextInt();
            a[i]=reader.nextInt();
        }
        for(i=0;i<a.length;i++){
            max=i;
            for(j=i+1;j<a.length;j++)
                if (a[max]<a[j])
                    max=j;
            temp=a[i];a[i]=a[max];a[max]=temp;
            temp=num[i];num[i]=num[max];num[max]=temp;
        }
        for (i=0;i<a.length;i++)
            System.out.println(num[i]+"\t"+a[i]);
    }
}