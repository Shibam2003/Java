//wap to draw a diagram using applet

import java.awt.*;//this package contains the graphics class
import java.applet.*;//this package contains the applet class
public class applet_7 extends Applet{
	public void paint(Graphics g){
		g.drawOval(100, 100, 300, 300);
		//g.fillOval(100, 100, 300, 200);
		
		//left eye	
		g.drawOval(150, 150, 70, 70);
		g.fillOval(150,155, 45, 45);

		//right eye
		g.drawOval(270, 150, 70, 70);
	}
}