//wap to display use of texfield in swing
import java.awt.*;
import javax.swing.*;//this is the package for swing
public class S2 extends JApplet{
public void init(){
Container c = getContentPane(); //here container act as the background of the swing
JTextField jf = new JTextField(10);//here JTextfield is used to create a text-box in swing
c.add(jf);
	}
}