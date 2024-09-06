import java.awt.*;//this package contains the graphics class
import java.applet.*;//this package contains the applet class
public class applet_5 extends Applet{
	public void paint(Graphics g){

		Color ob = new Color(175, 53, 212);
				

		g.setColor(Color.BLACK);
		
		g.drawLine(100,100, 400, 100);
		g.drawLine(40,200, 100, 100);
		g.drawLine(40, 500, 40, 200);
		g.drawLine(40, 500, 150, 500);
		g.drawLine(100, 100, 150, 200);
		g.drawLine(150, 200, 150, 500);
		g.drawLine(150, 500, 500, 500);
		g.drawLine(500, 200, 500, 500);
		g.drawLine(400, 100, 500, 200);
		g.drawLine(150, 200, 500, 200);

		
		
	
		g.setColor(ob);
		for(int x1 = 100, y1 = 100 , x2 = 150, y2 = 200; x1 <= 400; x1++,x2++){
			g.drawLine(x1, y1, x2, y2);
		}   
		int x2 = 150;
		while(x2 != 500){
			g.drawLine(400, 100, x2, 200);
			x2++;
		}
		
		g.setColor(Color.BLUE);
		g.fillRect(150, 200, 350, 300);
		

		g.setColor(Color.RED);
		g.drawOval(50, 50, 50, 50);
		g.fillOval(50, 50, 50, 50);
	}
}