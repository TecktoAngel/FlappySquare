package flappyBird;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Renderer extends JPanel {

	private static final long serialVersionUID = 1L;
	
	protected void paintComponent(Graphics g) {
		
		super.paintComponents(g);
		FlappyBird.flappyBird.repaint(g);
	}
	
	
}
