package firstAgent;

import java.util.ArrayList;
import java.util.Observable;


public class EnvironmentModel extends Observable{
	
	private GUI g;
	private GUIAgent ga;
	private Rectangle r;
	private ArrayList<Line> lines; 
	
	
	public void setGui(GUI g){
		this.g =g;
		addObserver(g);
		ga = new GUIAgent("ga");
		lines = new ArrayList<Line>();
	}
	
	public void setEnvironment(){
		r = new Rectangle(300,1000);
		setChanged();
		notifyObservers(r);
		Line l= new Line(1000, 300, 1000, 1500);
		setChanged();
		notifyObservers(l);
		lines.add(l);
		l= new Line(2000, 600, 2000, 1800);
		
		setChanged();
		notifyObservers(l);
		lines.add(l);
		
	}
	
	
	public void runGame(){
		while(g.notAhit()){
			setChanged();
			notifyObservers(ga.makeDecision(ga.getInputFromGUi(r,lines)).getName());
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args){
		EnvironmentModel ev = new EnvironmentModel();
		GUI g = new GUI();
		ev.setGui(g);
		ev.setEnvironment();
		ev.runGame();
	}
}
