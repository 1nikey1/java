public class Test3 {
    public static void main(String[] args) {
        for(int i=10;i<=8518;i++){
            String s=i+" ";
            int len=s.length();
            int sum=0;
            for (int j=0; j<len;j++){
                int t=len-j-1;
                int tmp=1;
                while (t-->0)
                    tmp*=16;
                sum+=tmp*(s.charAt(j)-'0');
            }
            if(sum%i==0){
                System.out.println(i);
                break;
            }
        }
    }
}
