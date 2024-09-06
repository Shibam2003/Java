//animation in java
import java.awt.*;
import java.awt.event.*;//this package is responsible for event handling
import java.applet.*;

public class event4 extends Applet implements KeyListener
{
	int x1 = 100, y1 = 100;
public void init(){
	addKeyListener(this);//this method is responsible for adding the key listener within the program
	requestFocus();//activating the keyListener
	}
public void keyPressed(KeyEvent ke){
	showStatus("Key is pressed");//this method is used to display anything in the status bar of the applet
	}
	
public void keyReleased(KeyEvent ke){
	showStatus("key is released");
	}
public void keyTyped(KeyEvent ke){
	repaint();//calling the paint method
	}
	public void paint(Graphics g){
	g.drawOval(x1, y1, 50, 50);
	x1 = x1 + 10;
	}
}