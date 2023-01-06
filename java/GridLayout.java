import java.awt.*;

public class GridLayout {
    public static void main(String[] args){
        Frame f=new Frame();
        f.setLayout(new java.awt.GridLayout(5,5));
        f.add(new Button("1"));
        f.add(new Button("2"));
        f.add(new Button("3"));
        f.add(new Button("4"));
        f.add(new Button("5"));
        f.add(new Button("6"));
        f.add(new Button("7"));
        f.add(new Button("8"));
        f.add(new Button("9"));
        f.add(new Button("10"));
        f.setSize(500,500);
        f.setVisible(true);
    }
}
