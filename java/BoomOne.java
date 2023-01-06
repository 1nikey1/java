import javax.swing.*;
import java.util.Random;
public class BoomOne {
    public static void main(String[] args) {
        int n=0;
        Random rd=new Random();
        while (n<500){
            JFrame frame =new JFrame("込込込込込込込込込込込");
            frame.setSize(400,100);
            frame.setLocation(rd.nextInt(1920),rd.nextInt(1080));
            frame.setVisible(true);
            n++;
        }
    }
}