package firstAgent;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Stroke;


public class Rectangle {
	
		private  Color color=Color.GRAY;
		private int x,y;
		public static final int WIDTH=450;
		public static final int HEIGHT=150;
		
		public  Rectangle(int x,int y){
			this.x=x;
			this.y=y;
			
			
		}
		
		public void setX(int x) {
			this.x = x;
		}
		
		public void addY(int y) {
			this.y =this.y-y;
		}
		public void addX(int x) {
			this.x =this.x +x;
		}
		
		public void drawRectangle(Graphics g){
			Graphics2D g2 =(Graphics2D)g;
	    	g2.setRenderingHint(
	    		    RenderingHints.KEY_ANTIALIASING,
	    		    RenderingHints.VALUE_ANTIALIAS_ON);
	    		g2.setRenderingHint(
	    		    RenderingHints.KEY_TEXT_ANTIALIASING,
	    		    RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
	    		

	    	
	    	
	    	g2.setColor(color);
	    	g2.fillRect(x-WIDTH/2,y,WIDTH,HEIGHT);
	    	Stroke oldStroke = g2.getStroke();
	    	g2.setStroke(new BasicStroke(3));
	    	g2.setColor(Color.BLACK);
	    	g2.drawRect(x-WIDTH/2,y,WIDTH,HEIGHT);
	    	g2.setStroke(oldStroke);
	  
			
			
		}
		public int getX() {
			
			return x;
		}
		public int getY() {
			
			return y;
		}
		
		public Color getColor() {
			return color;
		}
		public void setColor(Color color) {
			this.color = color;
		}
		
}
