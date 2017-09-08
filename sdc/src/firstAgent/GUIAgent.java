package firstAgent;

import java.util.ArrayList;

import agentModule.Action;
import agentModule.Agent;
import agentModule.Input;
import inputs.AtomicInput;
import inputs.ComplexInput;

public class GUIAgent extends Agent {
	private ComplexInput comp;
	public GUIAgent(String name) {
		super(name);
		
	}

	@Override
	public Action makeDecision(Input i) {
		if(i.get("right")==1.0){
			return new Action("up");
		}
		return new Action("right");
	}

	public Input getInputFromGUi(Rectangle r, ArrayList<Line> lines) {
		
		for(Line l:lines){
			
			if(Math.abs(r.getX()+Rectangle.WIDTH/2-l.getX1())<20  ){
				getInput().changeValue("right", 1);
			if(r.getY() -Rectangle.HEIGHT/2 -l.getY2() >20){
				getInput().changeValue("right", 0);
			}
			break;
			}
		}
		return getInput();
	}
	
	
	
	
	

}
