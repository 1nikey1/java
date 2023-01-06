import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CeShi {
    public void main(String[] args){
        Frame f=new Frame("Test");
        Button b=new Button("Press me!");
        b.addActionListener(new ButtonHandler());
        f.add("center",b);
        f.setVisible(true);
    }
    class ButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.out.println("Action occurred");
        }
    }
}
