package Cse513;
import java.awt.*;
import java.awt.event.*;

public class KeyListenerExample extends Frame implements KeyListener {
	Label l;
	TextArea ta;
	KeyListenerExample(){
		l = new Label();
		l.setBounds(100,100,500,20);
		ta = new TextArea();
		ta.setBounds(200,200,400,400);
		ta.addKeyListener(this);
		add(l);
		add(ta);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		setLayout(null);
		setSize(1000,1000);
		setVisible(true);
		}
	
	public void keyTyped(KeyEvent e) {
		l.setText("Key Typed");
	}
	public void keyReleased(KeyEvent e) {
		String s = ta.getText();
		String words[] = s.split("\\s");
		if(s.length()==0) {
			l.setText("Key released words: 0 characters: 0");
			}
		l.setText("Key released words: "+words.length+" characters: "+s.length());
		}
	public void keyPressed(KeyEvent e) {
		l.setText("Key Pressed");
	}
	public static void main(String args[]) {
		new KeyListenerExample();
	}

}
