package com.example;

import javax.swing.JFrame;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // membuat jendela utama untuk game
        JFrame window = new JFrame ("shadow");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        GamePanel GamePanel=new GamePanel();
        window.add(GamePanel);
        
        window.pack();
        window.setVisible(true);
        window.setLocationRelativeTo(null);


        
    }
}
