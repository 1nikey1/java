import java.awt.*;
import java.awt.BorderLayout;
import  java.awt.event.*;
public class CardLayoutText {
    CardLayoutText layout=new CardLayoutText();
    Frame f=new Frame("CardFrame");
    Button page1button;
    Label page2label;
    TextArea page3text;
    Button page3top,page3bottom;
    public static void main(String[] args){
        new CardLayoutText().go();
    }
    public void go(){
        f.setLayout((LayoutManager) layout);
        f.add(page1button=new Button("Button page"),"page1button");
        f.add(page2label=new Label("Label page"),"page2Label");
        Panel panel=new Panel();
        panel.setLayout(new BorderLayout());
        panel.add(page3text=new TextArea("Composite page"));
        panel.add(page3top=new Button("Top button"),"North");
        panel.add(page3bottom=new Button("Bottom button"),"South");
        f.add(panel,"panel");
        f.setSize(400,400);
        f.setVisible(true);
        page1button.addMouseListener((MouseListener) this);
        page2label.addMouseListener((MouseListener) this);
        page3bottom.addMouseListener((MouseListener) this);
        page3top.addMouseListener((MouseListener) this);
    }
}
