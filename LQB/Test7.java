import java.util.*;

public class Test7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> list=new ArrayList<>();
        Set<String> set=new HashSet<>();
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            String s=sc.next();
            if(!set.contains(s)){
                set.add(s);
                list.add(s);
            }
        }
        for (String x: list)
            System.out.println(x);
    }
}
