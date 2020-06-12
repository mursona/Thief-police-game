package kptr;

import java.awt.Color;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Dice {

    private final int userGuess;
    private int guess;
    private final String[] imgs = {"1.png","2.png","3.png","4.png"};
    private final int[] faces = {1, 2, 3, 4};
    private String text;

    public Dice(int userGuess) {

        this.userGuess = userGuess;

    }

    public void play(JLabel lbl, JLabel lblTguess) {

        Random r = new Random();

        guess = faces[r.nextInt(faces.length)];

        if (userGuess == guess) {

           
            text = "***Win The Game";
            lbl.setForeground(new Color(205, 92, 92));
            lbl.setText(text + String.valueOf(guess));

            lblTguess.setIcon(new ImageIcon(getClass().getResource(imgs[guess - 1])));

        } else {

            text = "You Failed.Try Again?";
            lbl.setForeground(new Color(139, 0, 139));
            lbl.setText(text + String.valueOf(guess));
            lblTguess.setIcon(new ImageIcon(getClass().getResource(imgs[guess - 1])));

        }
    }

}