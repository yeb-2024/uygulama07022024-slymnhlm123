package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AçılanSayfa implements ActionListener
{
    JFrame frame = new JFrame();

    JLabel labelisim = new JLabel("İsim : "+"Halilişko");
    JLabel labelmemleket = new JLabel("Memleket : "+"KÜRDİSTAN");
    JLabel labelmeslek = new JLabel("Meslek : "+"Patatesci");

    JButton button = new JButton("Kapat");

    JLabel imagelabel = new JLabel();

    JPanel panel2 = new JPanel();
    JPanel panel1 = new JPanel();

    public AçılanSayfa()
    {
        ImageIcon ıcon = new ImageIcon("halilişko.jpg");
        Image icon = ıcon.getImage().getScaledInstance(150,150,Image.SCALE_SMOOTH);
        ImageIcon newicon = new ImageIcon(icon);


        imagelabel.setIcon(newicon);

        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(1,2));

        button.addActionListener(this);
        button.setFont(new Font("Arial",Font.PLAIN,20));
        button.setFocusable(false);


        labelisim.setFont(new Font("Arial",Font.PLAIN,20));
        labelmemleket.setFont(new Font("Arial",Font.PLAIN,17));
        labelmeslek.setFont(new Font("Arial",Font.PLAIN,20));

        panel2.setLayout(new GridLayout(4,1));
        panel1.add(imagelabel);


        panel2.add(labelisim);
        panel2.add(labelmemleket);
        panel2.add(labelmeslek);
        panel2.add(button);

        frame.add(panel1);
        frame.add(panel2);




        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
