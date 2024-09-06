//use of checkbox in swing
import java.awt.*;
import javax.swing.*;//this is the package for swing
public class S3 extends JApplet{
public void init(){
Container c = getContentPane(); //here container act as the background of the swing
c.setLayout(new FlowLayout());//in-order to display the checkbox side by side

JCheckBox jc1 = new JCheckBox("C");
JCheckBox jc2 = new JCheckBox("JAVA");
JCheckBox jc3 = new JCheckBox("PYTHON");
c.add(jc1);
c.add(jc2);
c.add(jc3);
	}
}