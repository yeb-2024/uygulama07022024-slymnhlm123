package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnaSayfa implements ActionListener
{
    JFrame frame = new JFrame();

    JButton button = new JButton();


    public AnaSayfa()
    {
        button.setText("Profil Aç");
        button.addActionListener(this);
        button.setFocusable(false);
        button.setBounds(100,160,200,40);

        frame.setSize(420,420);
        frame.setBackground(Color.GRAY);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(button);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == button)
        {
            AçılanSayfa sayfa = new AçılanSayfa();
            frame.dispose();
        }

    }
}
