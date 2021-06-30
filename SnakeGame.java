import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.Timer;

/**
* @author Emil-Ruud
*/

public class SnakeGame extends JFrame implements KeyListener, ActionListener{
	
	public SnakeElement se = new SnakeElement();
		
	public SnakeGame(){
		FlowLayout f = new FlowLayout();
		this.setTitle("Snake Game");
		this.setBackground(Color.BLACK);
		this.setLayout(f);
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addKeyListener(this);
		this.setVisible(true);
		this.drawStuff();
		Timer t = new Timer(10,this);
		t.start();
	}
	
	
	public void drawStuff(){
		Graphics g = this.getGraphics();
		g.clearRect(0, 0, this.getWidth(), this.getHeight());
		this.se.drawMe(g);
		
		}
		

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_UP){
			System.out.println("oppoverpil");	
			this.se.setY(this.se.getY()-10);
						
			Graphics g = this.getGraphics();
	}
		else if(e.getKeyCode()==KeyEvent.VK_DOWN){
			System.out.println("nedoverpil");
			this.se.setY(this.se.getY()+10);
			
			Graphics g = this.getGraphics();
		}
		else if(e.getKeyCode()==KeyEvent.VK_LEFT){
			System.out.println("venstrepil");
			this.se.setX(this.se.getX()-10);
									
			Graphics g = this.getGraphics();
		}		
		else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
			System.out.println("høyrepil");
			this.se.setX(this.se.getX()+10);
			
			Graphics g = this.getGraphics();
		}
		
		this.drawStuff();
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.drawStuff();
	}}

