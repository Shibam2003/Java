//WAP to display use of mouse event
import java.awt.*;
import java.awt.event.*;//this package is responsible for event handling
import javax.swing.*;

public class event2 extends JApplet implements MouseListener//here MouseListener is an interface which is responsible for handling mouse related events
{
	JLabel j;
	public void init(){
	Container c = getContentPane();
	j = new JLabel("start", JLabel.LEFT);
	c.add(j);
	addMouseListener(this);
	
	requestFocus();//activating the MouseListener
	}

	public void mouseClicked(MouseEvent m){
	j.setText("Mouse is clicked");
	}
	
	public void mouseEntered(MouseEvent m){
	j.setText("Mouse entered");
	}
	
	public void mouseExited(MouseEvent m){
	j.setText("Mouse exited");
	}

	public void mousePressed(MouseEvent m){
	j.setText("Mouse is pressed");
	}

	public void mouseReleased(MouseEvent m){
	j.setText("Mouse is released");
	}
	
	
}