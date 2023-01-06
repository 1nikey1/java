package com.mg.one;

import javax.swing.*;
import java.awt.*;

public class Unicode10Demo {
    public static void main(String[] args){
        System.out.println(Character.toChars((0x1F600)));
        GuiApp();
    }
    public static void GuiApp(){
        JLabel emoji=new JLabel("\uD83d\uDE00");
        JFrame frame=new JFrame("Emojiʵ��");
        frame.setSize(400,100);
        frame.add(emoji);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane=frame.getContentPane();
        contentPane.setLayout(new FlowLayout());
    }
}
