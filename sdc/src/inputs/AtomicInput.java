package inputs;

import agentModule.Input;

/**
 * Atomic Input is an Input at the Atomic level (lowest level of inputs) it only has a name representation of it,and a feature value.
 * @author Owner
 *
 */
public class AtomicInput extends Input {
	private double value;
	public AtomicInput(String name,double v){
		super(name);
		value=v;
		
	}
	@Override
	public Double get(String name) {
		if(this.name.equals(name)){
			return value;
		}
		return null;
	}
	@Override
	public void changeValue(String name, double v) {
		if(this.name.equals(name)){
			value=v;
		}
	}
}
