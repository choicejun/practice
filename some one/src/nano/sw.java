package nano;
import java.awt.*;
import java.util.Scanner;

import javax.swing.*;

public class sw extends JFrame {
	/*
	 * Container c = new Container(); public sw(){ setTitle("��������");
	 * setVisible(true); setSize(500,300);
	 * setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 * 
	 * c = getContentPane(); JLabel la = new JLabel("����"); c.add(la); }
	 */
	public static void main(String[] args) {
	
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �Է����ּ���.");
		num = scanner.nextInt();
		if(num == ) {
			if(num %3 ==0) {
				System.out.println("3�� ����Դϴ�.");
			}
			else {
				System.out.println("3�� ����� �ƴմϴ�.");
			}
		}
		else {
			System.out.println("���� �Էµ��� �ʾҽ��ϴ�. ���� �Է����ּ���.");
		}
		
		scanner.close();
	}
	
	

}