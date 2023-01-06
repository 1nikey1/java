public class Puppy {
    int PuppyAge;
    public Puppy(String name){
        System.out.println("小狗的名字是："+name);
    }
    public void setAge(int age){
        PuppyAge=age;
    }
    public int getAge(){
        System.out.println("小狗的年龄为："+PuppyAge);
        return PuppyAge;
    }
    public static void main(String [] args){
        Puppy myPuppy=new Puppy("俊熙");
        myPuppy.setAge(2);
        myPuppy.getAge();
        System.out.println("变量值为："+myPuppy.PuppyAge);

    }
}
