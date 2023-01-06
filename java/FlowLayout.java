
import java.awt.*;

public class FlowLayout {
    public static void main(String[] args){
        Frame f=new Frame();
        f.setLayout(new java.awt.FlowLayout());
        Button button1=new Button("Yes");
        Button button2=new Button("cancel");
        Button button3=new Button("no");
        f.add(button1);
        f.add(button2);
        f.add(button3);
        f.setSize(300,300);
        f.setVisible(true);
        
    }
}
