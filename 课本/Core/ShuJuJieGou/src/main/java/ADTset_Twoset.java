import java.awt.geom.FlatteningPathIterator;

class Set<E>			       		//集合泛型类
{  final int MaxSize=100;	        	//集合中最多元素个数
    E[] data;		               	//存放集合元素
    int size;
    public Set() 			   	//构造方法
    {  data = (E[])new Object[MaxSize];  	//强制转换为E类型数组
        size=0;
    }
   public int getSize(){
        return size;
   }

   public E get(int i) {
        return data[i];
    }
    public boolean IsIn(E e){        //判断e是否在集合中
        for (int i=0;i<size;i++){
            if (data[i]==e)
                return  true;
        }
        return false;
    }
    public boolean add(E e){        //将元素e添加到集合中
        if (IsIn(e))return false;
        else {
            data[size]=e;
            size++;
            return true;
        }
    }
    public boolean delete(E e){     //从集合中删除元素e
        int i=0;
        while (i<size&&data[i]!=e)i++;
        if (i>=size)return false;
        for (int j=i+1;j<size;j++){
            data[j-1]=data[j];

        }
        size--;
        return true;
    }
    public void display(){             //输出集合中的元素
        for (int i=0;i<size;i++){
            if (i==0)
                System.out.print(data[i]);
            else
                System.out.print(" "+data[i]);
        }
    }
}
class Twoset<E>{
    public Set<E> Union(Set<E> s1,Set<E> s2){   //求s3=s1∪s2
        Set<E> s3=new Set<E>();
        for (int i=0;i<s1.getSize();i++)
            s3.add(s1.get(i));
        for (int i=0;i<s2.getSize();i++)
            if (!s1.IsIn(s2.get(i)))
                s3.add(s2.get(i));
        return s3;
    }
    public Set<E> Intersection(Set<E> s1,Set<E> s2){  //求s3=s1∩s2
        Set<E> s3=new Set<E>();
        for (int i=0;i<s1.size;i++)
            if (s2.IsIn(s1.get(i)))
                s3.add(s1.get(i));
        return s3;
    }
    public Set<E> Difference(Set<E> s1,Set<E> s2){   //求s3=s1-s2
        Set<E> s3=new Set<E>();
        for (int i=0;i<s1.size;i++)
            if (!s2.IsIn(s1.get(i)))
                s3.add(s1.get(i));
        return s3;
    }
}
public class ADTset_Twoset {
    public static void main(String[] args){
        Set<Integer> s1,s2,s3,s4,s5;
        Twoset<Integer> t=new Twoset<Integer>();
        s1=new Set<Integer>();
        s1.add(1);
        s1.add(4);
        s1.add(2);
        s1.add(6);
        s1.add(8);
        s2=new Set<Integer>();
        s2.add(2);
        s2.add(5);
        s2.add(3);
        s2.add(6);
        System.out.print("集合s1：");
        s1.display();
        System.out.println(" ");
        System.out.print("集合s2：");
        s2.display();
        s3=t.Union(s1,s2);
        System.out.println(" ");
        System.out.println("集合s1和s2的并集->s3");
        System.out.print("集合s3：");
        s3.display();
        s4=t.Difference(s1,s2);
        System.out.println(" ");
        System.out.println("集合s1和s2的差集->s4");
        System.out.print("集合s4：");
        s4.display();
        s5=t.Intersection(s1,s2);
        System.out.println(" ");
        System.out.println("集合s1和s2的交集->s5");
        System.out.print("集合s5：");
        s5.display();
    }
}