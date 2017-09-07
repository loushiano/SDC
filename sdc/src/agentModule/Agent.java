package agentModule;
/**
 * this Agent class is an abstract class that represents a generic Agent, more specifically a car agent, all agents that 
 * Specific to a certain domain or environment should inherit from this class, and use the functionality of this class.
 * @author
 *
 */
public abstract class Agent {
	private String name;
	
	/**
	 * @constructor
	 * @param name the name of the agent
	 */
	public Agent(String name){
		
	}
	/**
	 * this functions takes an input as a parameter, examines it, and return the Action that corresponds to the input
	 * @param i the input to which the agent must respond.
	 * @return Action the action that corresponds to the input given.
	 */
	public abstract Action makeDecision(Input i);
	//hello
	
}
