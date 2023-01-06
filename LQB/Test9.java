import java.util.Scanner;

public class Test9 {
    public static int dx1=-1;
    public static int dy1=-1;
    public static int dx2=-1;
    public static int dy2=1;
    public static int dx3=1;
    public static int dy3=-1;
    public static int dx4=1;
    public static int dy4=1;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char[][] q= new char[n][m];
        for (int i=0;i<n;i++){
            q[i]=sc.next().toCharArray();
        }
        int res=0;
        for (int i=1;i<n-1;i++){
            for (int j=1;j<m-1;j++){
                char ch=q[i][j];
                for (int k=1;k<=50;k++){
                    if (i+k*dx1>=0&&i+k*dx1<n&&i+k*dx2>=0&&i+k*dx2<n&&i+k*dx3>=0&&i+k*dx3<n&&i+k*dx4>=n&&i+k*dx4<n&&
                            j+k*dy1>=0&&j+k*dy1<m&&j+k*dy2>=0&&j+k*dy2<m&&j+k*dy3>=0&&j+k*dy3<m&&j+k*dy4>=0&&j+k*dy4<m&&
                    q[i+k*dx1][j+k*dy1]==ch&&q[i+k*dx2][j+k*dy2]==ch&q[i+k*dx3][j+k*dy3]==ch&&q[i+k*dx4][j+k*dy4]==ch) {
                        res++;
                    }
                    else
                        break;
                }
            }
        }
        System.out.println(res);
    }
}
