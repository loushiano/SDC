package agentModule;

import inputs.AtomicInput;
import inputs.ComplexInput;

/**
 * this Agent class is an abstract class that represents a generic Agent, more specifically a car agent, all agents that 
 * Specific to a certain domain or environment should inherit from this class, and use the functionality of this class.
 * @author
 *
 */
public abstract class Agent {
	private String name;
	protected ComplexInput comp;
	
	/**
	 * @constructor
	 * @param name the name of the agent
	 */
	public Agent(String name){
		comp=new ComplexInput("gui");
		AtomicInput i=new AtomicInput("up",0);
		AtomicInput i1=new AtomicInput("left",0);
		AtomicInput i2=new AtomicInput("down",0);
		AtomicInput i3=new AtomicInput("right",0);
		comp.addInput(i1);
		comp.addInput(i);
		comp.addInput(i2);
		comp.addInput(i3);
	}
	/**
	 * this functions takes an input as a parameter, examines it, and return the Action that corresponds to the input
	 * @param i the input to which the agent must respond.
	 * @return Action the action that corresponds to the input given.
	 */
	public abstract Action makeDecision(Input i);
	
	public ComplexInput getInput(){
		return comp;
	}
	
}
