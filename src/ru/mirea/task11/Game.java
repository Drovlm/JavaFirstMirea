package ru.mirea.task11;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.Scanner;


public class Game extends JFrame{

    private JPanel GG;
   //private JTextArea Text;
    private JButton clickHereToKnowButton;

    JTextArea Text;
    JButton button;
    JLabel label;

    public Game() {
    class event implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String text = Text.getText();
            label.setText(text);
        }
    }
        clickHereToKnowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        Text.addComponentListener(new ComponentAdapter() {
                                      @Override
                                      public void componentResized(ComponentEvent e) {

int X;
int Y;
for (int i = 1; i <= 1; i++) {
    X = 1 + (int) (Math.random() * 20);
    System.out.println(X);

    Scanner scanner = new Scanner(System.in);
    Y = Integer.parseInt(scanner.nextLine());
    if (Y == X) {
        System.out.println("Winner");
    } else {
        for (i = 1; i < 3; i++) {
            scanner = new Scanner(System.in);
            Y = Integer.parseInt(scanner.nextLine());
            if (Y == X) {
                System.out.println("Winner");
                break;
            } else {
                for (i = 1; i < 1; i++) {
                    scanner = new Scanner(System.in);
                    Y = Integer.parseInt(scanner.nextLine());
                    System.out.println("Loser");

                }
            }

        }
    }
} super.componentResized(e);
                                    }
                                });
                                }



                                          public static void main(String[] args) {
                                          JFrame frame = new JFrame("Game");
                                          frame.setContentPane(new Game().GG);
                                          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                          frame.pack();
                                          frame.setVisible(true);
                                      } }
