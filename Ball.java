import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Ball extends Rectangle{

	Random random;
	int xVel;
	int yVel;
	int intialspeed = 2;
	
	Ball(int x, int y, int width, int height){
		super(x,y,width,height);
		random = new Random();
		
		int randomXDirection = random.nextInt(2);
		if(randomXDirection == 0)
			randomXDirection --;
		setXDirection(randomXDirection * intialspeed);
		
		int randomYDirection = random.nextInt(2);
		if(randomYDirection == 0)
			randomYDirection --;
		setYDirection(randomYDirection * intialspeed);
		
	}
	
	public void setXDirection(int randomX) {
		xVel = randomX;
	}
	
	public void setYDirection(int randomY) {
		yVel = randomY;
	}
	
	public void move() {
		x += xVel;
		y += yVel;
		
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillOval(x, y, height, width);
	}
}
