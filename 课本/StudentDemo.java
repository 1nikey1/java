public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("s:" + s);
        System.out.println("����:"+s.name);
        System.out.println("���䣺"+s.name);
        System.out.println("-----------ֱ�������Ա����ֵ------------");
        s.name="С��";
        s.age=18;
        System.out.println("������"+s.name);
        System.out.println("���䣺"+s.age);
        System.out.println("-----------�ٴ������Ա����ֵ------------");
        s.study();
        s.exam();
    }
}
