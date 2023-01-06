import java.util.Scanner;
public class ShuZhu2 {
    public static void main(String[] args){
        int [] a;
        int i,x,n=5;
        a=new int[10];
        Scanner reader=new Scanner(System.in);
        for(i=0;i<n;i++)
            a[i]=reader.nextInt();
        System.out.println("please input you want to add the number");
        x=reader.nextInt();
        for (i=n-1;i>=0;i--)
            if (a[i] > x)
                //如果a[i]>x，那么用i+1来等于i
                a[i + 1] = a[i];
            else{
                //如果x比a[i]大，那么用下一位去存储x
                a[i + 1] = x;
                break;
        }
        if(i<0)
            //如果x都比他们小，那么就放在第一位
            a[0]=x;
        n++;//给数组加多一位数
        for (i=0;i<n;i++)
        {
            System.out.println(a[i]+"\t");
        }
    }
}
