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
		inputs = new HashMap<String,Input>();
	}
	@Override
	public Double get(String name) {
		for(Input i:inputs.values()){
			if(i.get(name)!=null){
				return i.get(name);
			}
		}
			return null;
	}
	/**
	 * adds the input passed to it to the set of inputs it has
	 * @param i the input to be added to the set of inputs this complex input has
	 */
	public void addInput(Input i){
		inputs.put(i.getName(), i);
	}
	@Override
	public void changeValue(String name, double v) {
		for(Input i:inputs.values()){
			
				i.changeValue(name, v);
			}
		
		
	}
}
