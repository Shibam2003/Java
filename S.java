import java.awt.*;
import javax.swing.*;//this is the package for swing
public class S extends JApplet{
public void init(){
Container c = getContentPane(); //here container act as the background of the swing
JLabel jb = new JLabel("Shibam",JLabel.CENTER);//here JLabel is used in-order to create a label in swing
c.add(jb);//this add method is used to add the created label 
	}
}