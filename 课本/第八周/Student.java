package 第八周;

import java.util.Scanner;

public class Student {
    private String name;
    private double score;
    private String _class;
    private String gender;
    Scanner sc=new Scanner(System.in);
    public Student(String _class,String name,double score,String gender){
        super();
        this._class=_class;
        this.name=name;
        this.score=score;
        this.gender=gender;
    }
    void setName(String name){
        this.name=name;
    }
    void setScore(double score){
        this.score=score;
    }
    void set_class(String _class){
        this._class=_class;
    }
    void setGender(String gender){
        this.gender=gender;
    }
    String getName(){
        return name;
    }
    String get_class(){
        return _class;
    }
    String getGender(){
        return gender;
    }
    double getScore(){
        return score;
    }
}
