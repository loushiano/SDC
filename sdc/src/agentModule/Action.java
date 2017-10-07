package agentModule;

/**
 * this class represents an action "outcome" of an agent when responding to a state, it is represented by its name. Actions are always atomic
 * @author Owner
 *
 */
public class Action {
	
	private String name;
	/**
	 * @Constructor
	 * @param name the name representation of the Action
	 */
	public Action(String name){
		this.name=name;
	}
	/**
	 * returns the name of the Action.
	 * @return the name of the Action
	 */
	public String getName(){
		return name;
	}
	//hello
	//hello
}
