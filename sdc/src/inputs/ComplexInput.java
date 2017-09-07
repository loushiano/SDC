package inputs;

import java.util.HashMap;

import agentModule.Input;

/**
 * ComplexInput is an Input that has at least one Input, which could be Atomic or Complex.
 * @author Owner
 *
 */
public class ComplexInput extends Input{

	private HashMap<String,Input> inputs;
	public ComplexInput(String name){
		super(name);
	}
	@Override
	public double get(String name) {
		return inputs.get(name).get(name);
	}
	/**
	 * adds the input passed to it to the set of inputs it has
	 * @param i the input to be added to the set of inputs this complex input has
	 */
	public void addInput(Input i){
		inputs.put(i.getName(), i);
	}
}
