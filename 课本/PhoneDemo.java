public class PhoneDemo {
    public static void main(String[] args){
        Phone p=new Phone();
        System.out.println("Ʒ�ƣ�"+p.brand);
        System.out.println("�۸�"+p.price);
        System.out.println("��ɫ��"+p.color);
        System.out.println("------------�����Ա����--------------");
        p.color="��ɫ";
        p.price=3999;
        p.brand="��Ϊ";
        System.out.println("Ʒ�ƣ�"+p.brand);
        System.out.println("�۸�"+p.price);
        System.out.println("��ɫ��"+p.color);
        System.out.println("------------�ٴ������Ա����--------------");
        p.call("������");
        p.sendMessage();
    }
}
