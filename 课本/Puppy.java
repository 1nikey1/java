public class Puppy {
    int PuppyAge;
    public Puppy(String name){
        System.out.println("С���������ǣ�"+name);
    }
    public void setAge(int age){
        PuppyAge=age;
    }
    public int getAge(){
        System.out.println("С��������Ϊ��"+PuppyAge);
        return PuppyAge;
    }
    public static void main(String [] args){
        Puppy myPuppy=new Puppy("����");
        myPuppy.setAge(2);
        myPuppy.getAge();
        System.out.println("����ֵΪ��"+myPuppy.PuppyAge);

    }
}
