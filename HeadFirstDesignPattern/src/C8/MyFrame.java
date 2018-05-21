package C8;

import java.awt.Graphics;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public  MyFrame(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setVisible(true);
	}
	@Override
	public void paint(Graphics graphics) {
		// TODO Auto-generated method stub
		super.paint(graphics);
		String mString = "I rule!!!";
		graphics.drawString(mString, 100, 100);
	}
	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame("Design Patterns");
	}
}
