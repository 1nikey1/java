package 第八周;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int k;
    public static Student[] stu;
    public static Scanner sc;
    public void insert(int a,String _class,String name,double score,String gender){
        stu= Arrays.copyOf(stu,k+1);
        for(int i=k;i>a;i++){
            stu[i]=stu[i-1];
        }
        stu[a]=new Student(_class,name,score,gender);
        k++;
        for (int i=0;i<k;i++){
            System.out.println(stu[i].get_class() + "班  " + stu[i].getName() + "  " + stu[i].getGender() + " " + stu[i].getScore() + "分");//遍历数组
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("输入数组长度");
        k=sc.nextInt();
        Student [] stu=new Student[k];
    }
}
