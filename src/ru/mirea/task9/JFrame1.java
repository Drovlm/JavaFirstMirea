package ru.mirea.task9;

import javax.swing.*;

public class JFrame1 {
    private JButton Madrid;
    private JPanel Panel1;
    private JButton Milan;

    public JFrame1() {
        Madrid.addActionListener(e -> {
        });
        Milan.addActionListener(e -> {
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame");
        frame.setContentPane(new JFrame1(). Panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

