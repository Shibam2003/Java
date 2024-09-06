import java.awt.*;//this package contains the graphics class
import java.applet.*;//this package contains the applet class
public class applet_8 extends Applet{
	public void paint(Graphics g){
		g.setColor(Color.RED);
		g.drawOval(100, 100, 300, 300);
		g.fillOval(100,100, 300, 300);
		
	}
}