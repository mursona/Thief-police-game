package kptr;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class OpeningWindow1 extends JPanel{
	
	JFrame window = new JFrame();
	OpeningWindow1()
	{
		window.add(this);
		window.setLocation(450,100);
		window.setUndecorated(true);
		window.setSize(545,500);
		window.setVisible(true);
		try {
			
			Thread.sleep(5000);
			window.dispose();
			KPTR m = new KPTR();
		}catch(Exception e) {System.out.println(e);}
	}
	
	public void paint(Graphics g)
	{
		ImageIcon background = new ImageIcon(getClass().getResource("kk.png"));
		g.drawImage(background.getImage(),0,0,null);
	}	

}
