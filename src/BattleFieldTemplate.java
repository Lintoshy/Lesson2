import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class BattleFieldTemplate extends JPanel {

	boolean COLORDED_MODE = true;
	
	int tankX = 256;
	int tankY = 256;
	
	long speed = 225;
	
	
	/**
	 * Write your code here.
	 */
	
	void runTheGame() throws Exception {
		int direction = 2;	
		while (true){
			
			moveRandom ();
			
			repaint ();
			Thread.sleep(speed);
		}
		
	}
	
	void move (int direction) {
		
		if (direction == 1 && tankY == 0 || direction == 2 && tankY == 512 || direction == 3 && tankX == 0 
				|| direction == 4 && tankX == 512){
			
			System.out.println("Stop");
			return;		
		}
		if (direction == 1){
			tankY -= 64;	
			System.out.println("move up, " + "coordinate: " + "x" + tankX +" : " + "y" + tankY);
		}
		if (direction == 2){
			tankY += 64;
			System.out.println("move down, " + "coordinate: " + "x" + tankX +" : " + "y" + tankY);
		}
		if (direction == 3){
			tankX -= 64;
			System.out.println("move left, " + "coordinate: " + "x" + tankX +" : " + "y" + tankY);
		}
		if (direction == 4){
			tankX += 64;
			System.out.println("move right, " + "coordinate: " + "x" + tankX +" : " + "y" + tankY);
		}
		
		
	}
	void moveRandom () {

		int direction = 2;
		int point = Integer.parseInt (String.valueOf(
				System.currentTimeMillis()).substring(12, 13));
		if (point == 0 || point == 4 || point == 8){
			direction = 1;
		} else if (point == 1 || point == 5 || point == 9) {
			direction = 2;
		} else if (point == 2 || point == 6) {
			direction = 3;
		} else if (point == 3 || point == 7) {
			direction = 4;
		}
		move(direction);

	}
	

	
	// Magic bellow. Do not worry about this now, you will understand everything in this course.
	// Please concentrate on your tasks only.

	final int BF_WIDTH = 576;
	final int BF_HEIGHT = 576;
	
	public static void main(String[] args) throws Exception {
		BattleFieldTemplate bf = new BattleFieldTemplate();
		bf.runTheGame();
	}

	public BattleFieldTemplate() throws Exception {
		JFrame frame = new JFrame("BATTLE FIELD, DAY 2");
		frame.setLocation(500, 150);
		frame.setMinimumSize(new Dimension(BF_WIDTH, BF_HEIGHT + 22));
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.getContentPane().add(this);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		int i = 0;
		Color cc;
		for (int v = 0; v < 9; v++) {
			for (int h = 0; h < 9; h++) {
				if (COLORDED_MODE) {
					if (i % 2 == 0) {
						cc = new Color(252, 241, 177);
					} else {
						cc = new Color(233, 243, 255);
					}
				} else {
					cc = new Color(180, 180, 180);
				}
				i++;
				g.setColor(cc);
				g.fillRect(h * 64, v * 64, 64, 64);
			}
		}
		
		g.setColor(new Color(255, 0, 0));
		g.fillRect(tankX, tankY, 64, 64);
	}

}