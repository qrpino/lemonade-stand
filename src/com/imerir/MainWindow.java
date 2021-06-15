package com.imerir;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;

public class MainWindow extends JFrame {

    JButton b = new JButton(new ImageIcon(getClass().getResource("/start.png")));


    MainWindow() {
        // mise en place de la fenêtre
        setTitle("Lemonade Stand");
        setBounds(10, 10, 600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());
        setContentPane(panel);
        b.addActionListener(this::startGame);
        b.setSize(397, 59);
        panel.add(b, BorderLayout.PAGE_END);
    }

    void startGame(ActionEvent event){

    }
}
