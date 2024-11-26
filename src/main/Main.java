package main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //create window
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("MyGame");

        //instantiate game panel
        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);
        window.pack();

        //set window visible
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        //start
        gamePanel.setupGame();
        gamePanel.startGameThread();

        }
    }