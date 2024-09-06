import java.awt.*;
import javax.swing.*;//this is the package for swing
public class S4 extends JApplet{
public void init(){
Container c = getContentPane(); //here container act as the background of the swing
c.setLayout(new FlowLayout());//in-order to display the checkbox side by side

JRadioButton jr1 = new JRadioButton("C");
JRadioButton jr2 = new JRadioButton("JAVA");
JRadioButton jr3 = new JRadioButton("PYTHON");
JRadioButton jr4 = new JRadioButton("C++");
c.add(jr1);
c.add(jr2);
c.add(jr3);
c.add(jr4);
	}
}