package nano;
import java.awt.*;
import java.util.Scanner;

import javax.swing.*;

public class sw extends JFrame {
	/*
	 * Container c = new Container(); public sw(){ setTitle("나도몰라");
	 * setVisible(true); setSize(500,300);
	 * setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 * 
	 * c = getContentPane(); JLabel la = new JLabel("몰라"); c.add(la); }
	 */
	public static void main(String[] args) {
	
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.println("수를 입력해주세요.");
		num = scanner.nextInt();
		if(num == ) {
			if(num %3 ==0) {
				System.out.println("3의 배수입니다.");
			}
			else {
				System.out.println("3의 배수가 아닙니다.");
			}
		}
		else {
			System.out.println("수가 입력되지 않았습니다. 수를 입력해주세요.");
		}
		
		scanner.close();
	}
	
	

}