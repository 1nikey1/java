public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("s:" + s);
        System.out.println("姓名:"+s.name);
        System.out.println("年龄："+s.name);
        System.out.println("-----------直接输出成员变量值------------");
        s.name="小王";
        s.age=18;
        System.out.println("姓名："+s.name);
        System.out.println("年龄："+s.age);
        System.out.println("-----------再次输出成员变量值------------");
        s.study();
        s.exam();
    }
}
