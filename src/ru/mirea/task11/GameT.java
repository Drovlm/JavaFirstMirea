package ru.mirea.task11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class GameT extends JFrame{
    JTextArea textarea;
    JButton button;
    JLabel label;

    int X,Y=0;
    public GameT() {

        setLayout(new FlowLayout());

        textarea = new JTextArea(5, 30);
        int X;
        int Y;
        for (int i = 1; i <= 1; i++) {
            X = 1 + (int) (Math.random() * 20);
            System.out.println(X);

            Scanner scanner = new Scanner(System.in);
            Y = Integer.parseInt(scanner.nextLine());

            if (Y == X) {
                label = new JLabel("Winner ");
                add(label);
            } else {

                for (i = 1; i < 3; i++) {

                    scanner = new Scanner(System.in);
                    Y = Integer.parseInt(scanner.nextLine());
                    if (Y == X) {
                        label = new JLabel("Winner ");
                        add(label);
                        break;
                    } else {
                        for (i = 1; i < 2; i++) {

                            scanner = new Scanner(System.in);
                            Y = Integer.parseInt(scanner.nextLine());
                            label = new JLabel("Loser ");
                            add(label);

                        }
                    }

                }
            }
        }


        add(textarea);

        button = new JButton("Click here to know the result:");
        add(button);


        label = new JLabel(" ");
        add(label);

        event e = new event();
        button.addActionListener(e);

    }

    public class event implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String text = textarea.getText();


            Scanner scanner = new Scanner(System.in);
            X = Integer.parseInt(scanner.nextLine());
            if (X==Y){label = new JLabel("Winner ");
                add(label);
            }
            label.setText(text);
        }
    }
    public static void main (String args[]){
        GameT gui = new GameT();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(350,300);
        gui.setVisible(true);
    }

}
