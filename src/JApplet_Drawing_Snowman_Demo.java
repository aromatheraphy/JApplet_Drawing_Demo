import javax.swing.JApplet;
import java.awt.*;

public class JApplet_Drawing_Snowman_Demo extends JApplet {
	public void paint(Graphics page) {
		final int middle=150;
		final int top=50;
		
		page.setColor(Color.CYAN);
		page.fillRect(0, 0, 300, 225);
		
		page.setColor(Color.DARK_GRAY);
		page.fillRect(0, 175, 300, 50);
		
		page.setColor(Color.ORANGE);
		page.fillOval(-40, -40, 80, 80);
		
		page.setColor(Color.white);
		page.fillOval(middle-20, top, 40, 40);
		page.fillOval(middle-35, top+35, 70, 50);
		page.fillOval(middle-50, top+80, 100, 60);
		
		page.setColor(Color.BLACK);
		page.fillOval(middle-10, top+10, 5, 5);
		page.fillOval(middle+5, top+10, 5, 5);
		
		page.drawArc(middle-10, top+20, 20, 10, 190, 160);
		
		page.drawLine(middle-25,top+60,middle-50,top+40);
		page.drawLine(middle+25,top+60,middle+55,top+60);
		
		page.drawLine(middle-20,top+5,middle+20,top+5);
		page.fillRect(middle-15, top-20, 30, 25);
	}
}
