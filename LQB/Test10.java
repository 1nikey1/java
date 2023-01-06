import com.sun.jndi.toolkit.ctx.StringHeadTail;

import java.util.Scanner;

public class Test10 {
    public static int N=1000010;
    public static int n;
    public static int[] h=new int[N];
    public static int[] tr=new int[N];
    public static int[] sum=new int[N];

    public static int lowbit(int x){
        return x&(-x);
    }

    public static void add(int x,int y){
        for (int i=x;i<N;i+=lowbit(i)){
            tr[i]+=y;
        }
    }

    public static int query(int x){
        int res=0;
        for (int i=x;i>0;i-=lowbit(i)){
            res+=tr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for (int i=0;i<n;i++){
            h[i]=sc.nextInt();
        }
        for (int i=n-1;i>=0;i--){
            sum[i]=query(h[i]-1);
            add(h[i],1);
        }
        long res=0;
        for (int i=0;i<n;i++){
            res+=h[i]*sum[i];
        }
        System.out.println(res);
    }
}
