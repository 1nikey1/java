import java.util.Scanner;

public class FuShuTest {
    public static void main(String[] args){
        Fushu f;
        f=new Fushu();
        System.out.print("请输入实部和虚部");
        Scanner reader=new Scanner(System.in);
        f.shi=reader.nextInt();
        f.xu=reader.nextInt();
        if(f.shi==0)
            f.show2();
        else if (f.xu<0)
            f.show1();
        else
            f.show();
    }
}
class Fushu{
    double shi,xu;
    void show(){
        System.out.println(shi+"+"+xu+"i");
    }
    void show1(){
        System.out.println(shi+""+xu+"i");
    }
    void show2(){
        System.out.println(xu+"i");
    }
}
