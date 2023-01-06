import java.awt.*;

public class BorderLayout {
    public static void main(String[] args){
        Frame f=new Frame("BorderLayout");
        f.setLayout(new java.awt.BorderLayout());
        f.add("North",new Button("North"));
        f.add("South",new Button("South"));
        f.add("West",new Button("West"));
        f.add("East",new Button("East"));
        f.add("Center",new Button("Center"));
        f.setSize(400,200);
        f.setVisible(true);


    }
}
