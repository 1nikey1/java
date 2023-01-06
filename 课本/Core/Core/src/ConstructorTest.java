package Core.Core.src;

import java.util.Random;

public class ConstructorTest {
    public static void main(String[] args){
        var staff=new Core.Core.src.Employee1[3];
        staff[0]=new Core.Core.src.Employee1("harry",40000);//���õ�һ��Employee����
        staff[1]=new Core.Core.src.Employee1(60000);//���õڶ���
        staff[2]=new Core.Core.src.Employee1();//������
        for(Core.Core.src.Employee1 e:staff)
            System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
    }
}
class Employee1{
    private static int nextId;
    private int id;
    private String name="";
    private double salary;
    static {
        var generator=new Random();
        nextId = generator.nextInt(1000);
    }
    {
        id=nextId;
        nextId++;
    }
    public Employee1(String n,double s){
        name =n;
        salary=s;
    }
    public Employee1(double s){
        this("Employee #"+nextId, s);
    }
    public Employee1(){}
    public String getName(){
        return name;
    }

    public double getSalary() {
        return salary;
    }
    public int getId(){
        return id;
    }
}
