package com.mycompany.gui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class GUI {

    public static void main(String[] args) {
    JFrame frame= new JFrame();
    JLabel label = new JLabel();
    Border bord = BorderFactory.createLineBorder(Color.yellow,12);
    frame.getContentPane().setBackground(Color.white);
    frame.setTitle("GUI project");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    frame.setSize(500,500);
ImageIcon image =new ImageIcon("img.png");
    label.setText("Hello world");
    frame.add(label);
    frame.setIconImage(image.getImage());
   label.setIcon(image); 
   label.setHorizontalTextPosition(JLabel.CENTER);
   label.setVerticalTextPosition(JLabel.CENTER);
   label.setForeground(Color.blue);
   label.setFont(new Font("MV Boli",Font.ITALIC,20));
   label.setIconTextGap(-25);
   label.setBorder(bord);
   label.setVerticalAlignment(JLabel.CENTER);
   label.setHorizontalAlignment(JLabel.CENTER);
    frame.setVisible(true);
    
    
    }
}