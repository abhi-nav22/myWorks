import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ball{

	private double x, y, dx, dy; 
	
	public Ball(double x, double y){
		
		this.x = x;
		this.y = y;
		
	}
	
	public void move(){
		
		this.setX(this.getX() + this.getDX());
        this.setY(this.getY() + this.getDY());
	}
	
	//gets Image of ball
	public Image getImage(){
		
		return new ImageIcon("ball.png").getImage();
	}
    //gets x velocity of the ball
    public double getDX() {
        return dx;
    }

    //gets y velocity of ball
    public double getDY() {
        return dy;
    }

    //gets x-coordinate of ball
    public double getX() {
        return x;
    }

    //gets y-coordinate of ball
    public double getY() {
        return y;
    }
    
    //sets x velocity of ball
    public void setDX(double dx) {
        this.dx = dx;
    }
    
    //sets y velocity of ball
    public void setDY(double dy) {
        this.dy = dy;
    }
    
    //sets x-coordinate of ball
    public void setX(double x) {
        this.x = x;
    }

    //sets y-coordinate of ball
    public void setY(double y) {
        this.y = y;
    }

}