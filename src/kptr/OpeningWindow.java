package kptr;
import java.awt.Graphics;
import java.io.File;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class OpeningWindow extends JPanel{
	
	JFrame window = new JFrame();
	OpeningWindow()
	{
		window.add(this);
                			
		try {
			File sound = new File("air.wav");
		AudioInputStream ais= AudioSystem.getAudioInputStream(sound);
		Clip clip= AudioSystem.getClip();
		clip.open(ais);
		clip.start();
		}catch(Exception e) {System.out.println(e);}
		window.setLocation(450,100);
		window.setUndecorated(true);
		window.setSize(545,500);
		window.setVisible(true);
		try {
			
			Thread.sleep(5000);
			window.dispose();
			OpeningWindow1 ow1 = new OpeningWindow1();
		}catch(Exception e) {System.out.println(e);}
	}
	
	public void paint(Graphics g)
	{
		ImageIcon background = new ImageIcon(getClass().getResource("ii.png"));
		g.drawImage(background.getImage(),0,0,null);
	}	

}
