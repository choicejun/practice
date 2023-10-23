package nano;
import javax.swing.*;
import java.awt.*;
public class saysome extends JFrame {
	Container c;
	saysome(){
		setTitle("뉴타이틀");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		JLabel j = new JLabel("헤이엄마");
		c.add(j);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
	new saysome();
	}

}
