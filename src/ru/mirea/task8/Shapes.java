package ru.mirea.task8;

/*import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class Shapes extends JPanel{

    private static final Random randomShape = new Random();

    public void paintComponent( Graphics g ){
        super.paintComponent( g );
        int width = getWidth();
        int height = getHeight();
        int shape;
        int colour;
        int x;
        int y;
        int shapeWidth;
        int shapeHeight;

        for( int i = 0; i < 10; i++ ){
            shape = decideShape();
            colour = decideColour();

            x = decideCoordinates( width );
            y = decideCoordinates( height );

            shapeWidth = decideSize( width );
            shapeHeight = decideSize( height );
            switch (colour) {
                case 1 -> g.setColor(Color.BLACK);
                case 2 -> g.setColor(Color.BLUE);
                case 3 -> g.setColor(Color.CYAN);
                case 4 -> g.setColor(Color.DARK_GRAY);
                case 5 -> g.setColor(Color.GRAY);
                case 6 -> g.setColor(Color.GREEN);
                case 7 -> g.setColor(Color.LIGHT_GRAY);
                case 8 -> g.setColor(Color.MAGENTA);
                case 9 -> g.setColor(Color.ORANGE);
                case 10 -> g.setColor(Color.PINK);
                case 11 -> g.setColor(Color.RED);
                case 12 -> g.setColor(Color.WHITE);
                case 13 -> g.setColor(Color.YELLOW);
            }
            switch (shape) {
                case 1 -> g.fillOval(x, y, shapeWidth, shapeHeight);
                case 2 -> g.fillRect(x, y, shapeWidth, shapeHeight);
            }
        }
    }
    public static int decideShape(){
        return 1 + randomShape.nextInt(2);
    }
    public static int decideColour(){
        return 1 + randomShape.nextInt(13);
    }
    public static int decideCoordinates( int origin ){
        return randomShape.nextInt( origin + 1 );
    }

    public static int decideSize(int dimension){
        return randomShape.nextInt( dimension / 2 );
    }
}*/
