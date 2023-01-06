public class PhoneDemo {
    public static void main(String[] args){
        Phone p=new Phone();
        System.out.println("品牌："+p.brand);
        System.out.println("价格："+p.price);
        System.out.println("颜色："+p.color);
        System.out.println("------------输出成员变量--------------");
        p.color="黑色";
        p.price=3999;
        p.brand="华为";
        System.out.println("品牌："+p.brand);
        System.out.println("价格："+p.price);
        System.out.println("颜色："+p.color);
        System.out.println("------------再次输出成员变量--------------");
        p.call("班主任");
        p.sendMessage();
    }
}
