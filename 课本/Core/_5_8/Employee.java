package Core._5_8;
import java.security.PublicKey;
import java.time.LocalDate;
import java.util.Objects;
import java.util.SplittableRandom;

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;
    public Employee(String name,double salary,int year,int month,int day){
        this.name=name;
        this.salary=salary;
        hireDay=LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }
    public double getSalary(){
        return  salary;
    }
    public LocalDate getHireDay(){
        return hireDay;
    }
    public void raiseSalary(double byPercent){
        double raise=salary*byPercent/100;
        salary+=raise;
    }
    @Override
        public boolean equals(Object otherObject){
        if(this==otherObject)
            return true;
        if(otherObject==null)
            return false;
        if(getClass()!=otherObject.getClass())
            return false;
        var other =(Employee) otherObject;
       // Object o=new Object();
        return name.equals(other.name)&& salary ==other.salary&& hireDay.equals(other.hireDay);
    }
    public int hashCode(){
        return Objects.hash(name,salary,hireDay);
    }
    public String toString(){
        return getClass().getName()+"[name="+name+",salary="+salary+",hireDay="+hireDay+"]";
    }
}