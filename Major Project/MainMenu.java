import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.Scanner;
import java.io.*;

public class MainMenu extends JFrame implements ActionListener {

	MyButton start, help, exit;
	MyButton[] buttons;

	JLabel bg;

	public MainMenu() {

		super("Brick Breaker v2.0");

		setLayout(null);
		setSize(800, 600);

		start = new MyButton("start");
		help = new MyButton("help");
		exit = new MyButton("exit");

		start.setSize(170, 65);
		help.setSize(380, 65);
		exit.setSize(120, 65);

		buttons = new MyButton[] { start, help, exit };

		for (int i = 0; i < buttons.length; i++) {

			MyButton b = buttons[i];
			b.setLocation(400 - b.getWidth() / 2, 300 + i * 75);
			b.addActionListener(this);
			add(b);

		}

		bg = new JLabel(new ImageIcon("Game background, angrysnail.png"));
		bg.setSize(800, 600);
		add(bg);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {

		Object src = e.getSource();

		if (src == start) {
			new BB();
			setVisible(false);

		} else if (src == help) {
			new HelpFrame();
			setVisible(false);

		} else if (src == exit) {
			System.exit(0);
		}

	}

	public static void main(String[] args) {
		new MainMenu();
	}
}

class MyButton extends JButton {

	public MyButton(String f) {

		ImageIcon p = new ImageIcon(f + "P.png");
		ImageIcon d = new ImageIcon(f + "D.png");

		this.setIcon(d);
		this.setRolloverIcon(p);
		this.setPressedIcon(d);
		this.setContentAreaFilled(false);
		this.setBorderPainted(false);

	}
}

class HelpFrame extends JFrame implements ActionListener {

	JLabel info;
	MyButton exit;

	public HelpFrame() {

		super();

		setLayout(null);
		setSize(800, 600);

		exit = new MyButton("exit");
		exit.setSize(120, 65);
		exit.setLocation(330, 400);
		exit.addActionListener(this);
		add(exit);

		info = new JLabel(new ImageIcon("info.png"));
		info.setSize(800, 600);
		add(info);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {

		Object src = e.getSource();

		if (src == exit) {

			new MainMenu();
			setVisible(false);

		}
	}

}

class LoseFrame extends JFrame implements ActionListener {

	JLabel msg, bg;
	MyButton exit;

	public LoseFrame() {

		super();

		setLayout(null);
		setSize(800, 600);

		Font f = new Font("Bebas Neue", Font.PLAIN, 60);

		msg = new JLabel("Game Over");
		msg.setFont(f);
		msg.setForeground(Color.WHITE);
		msg.setSize(400, 100);
		msg.setLocation(225, 250);
		add(msg);

		exit = new MyButton("exit");
		exit.setSize(120, 65);
		exit.setLocation(340, 450);
		exit.addActionListener(this);
		add(exit);

		bg = new JLabel(new ImageIcon("Game background, angrysnail.png"));
		bg.setSize(800, 600);
		add(bg);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {

		Object src = e.getSource();

		if (src == exit) {
			new MainMenu();
			setVisible(false);
		}
	}

}
