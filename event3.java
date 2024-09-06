import java.awt.*;
import java.awt.event.*;//this package is responsible for event handling
import javax.swing.*;

public class event3 extends JApplet implements ActionListener//here MouseListener is an interface which is responsible for handling mouse related events
{
	JButton b;//here it is responsible for providing button in swing
	public void init(){
	Container c = getContentPane();
	b = new JButton("Click");
	b.setSize(100,100);
	c.add(b);
	b.addActionListener(this);//adding the listener to the button
	}

	public void actionPerformed(ActionEvent a){
	showStatus("Button is pressed");
	b.setBackground(Color.BLUE);
	}
	
}