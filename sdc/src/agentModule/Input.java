package agentModule;
/**
 * the input class represents a state of an environment, it follows the composite pattern, where an input is either a complex Input or an
 * atomic input.  
 */
public abstract class Input {
	
	protected String name;
	
	/**
	 * @Constructor
	 * @param name the string representation of the input
	 */
	public Input(String name){
		this.name= name;
	}
	/**
	 * this function returns the feature value of the input represented by the name passed to it.
	 * @param name the name of the input we need to return the value of
	 * @return a value representation of the input needed
	 */
	public abstract Double get(String name);
	/**
	 * returns the name of the input
	 * @return the name of the input
	 */
	public String getName() {
		return name;
	}
	
	public abstract void changeValue(String name,double v);

}
