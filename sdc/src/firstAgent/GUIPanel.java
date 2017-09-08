package firstAgent;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;



public class GUIPanel  extends JPanel {
	
	private ArrayList<Line> lines;//ArrayList of lines
	private ArrayList<Rectangle> rectangles;
	
	
	
	/*
	 * Constructor that initialize the fields of this class
	 */
	public GUIPanel(){
		
		lines=new ArrayList<Line>();
		rectangles=new ArrayList<Rectangle>();
		
		
		
	}
	
	/*
	 * (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
			this.setBackground(Color.WHITE);
		
		
		
		
	
		if(rectangles.size()!=0){
			for(Rectangle r:rectangles){
				r.drawRectangle(g);
			}
			
		}
		if(lines.size()!=0){
			for(Line l:lines){
				l.draw(g);
			}
		}
	}
	
	
	/*
	 * invokes repaint to show all missing shapes
	 */
	public void draw() {
		repaint();
		
	}
	/*
	 * draws a line in the panel
	 * @param x1 the x-axis position of the first point
	 * @param y1 the y-axis position of the first point
	 * @param x2 the x-axis position of the second point
	 * @param y2 the y-axis position of the second point
	 */
	public void drawLine(Line line) {
		
		
		lines.add(line);
		
		repaint();
	}
	
	public ArrayList<Line> getLines(){
		return lines;
	}

	

	public void addRectangle(Rectangle rec) {
		rectangles.add(rec);
		
	}


}
