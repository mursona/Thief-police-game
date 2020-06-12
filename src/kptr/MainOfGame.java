package kptr;

import kptr.OpeningWindow;

public class MainOfGame {
     
	public static void main(String[] args) {
		OpeningWindow ow = new OpeningWindow();
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KPTR().setVisible(true);
            }
        });
}
}
