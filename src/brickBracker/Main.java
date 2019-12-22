package brickBracker;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame obj = new JFrame();
		Gameplay gobj = new Gameplay();
		obj.setBounds(10,10,700,600);
		obj.setTitle("BrickBreaker Game");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gobj);
	}

}
