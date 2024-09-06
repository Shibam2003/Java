//program to display event handling in java
import java.awt.*;
import java.applet.*;
import java.awt.event.*;//this package is responsible for event handling

public class event1 extends Applet implements KeyListener//here KeyListener is an interface which is responsible for handling key related events
{
	String msg = "";//creating an empty string
	int x = 50, y = 50;

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
	msg = msg + ke.getKeyChar();//here getKeyChar method is used to extract the particular character from the keyboard
	repaint();//calling the paint method
	}
	
	public void paint(Graphics g){
	g.drawString(msg,x,y);
	}
}