package nano;
import javax.swing.*;
import java.awt.*;
public class saysome extends JFrame {
	Container c;
	saysome(){
		setTitle("��Ÿ��Ʋ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		JLabel j = new JLabel("���̾���");
		c.add(j);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
	new saysome();
	}

}
