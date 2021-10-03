package state;

public class Curryrecipe {
	State newState;
	State rottenState;
	State burntState;
	
	State state;
	public Curryrecipe() {
		newState = new NewState(this);
		rottenState = new RottenState(this);
		burntState = new BurntState(this);
		
		state = newState;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public State getBurntState() {
		return burntState;
	}
	public State getRottenState() {
		return rottenState;
	}
	public State getNewState() {
		return newState;
	}
	public void burntCurryrecipe() {
		state.burntCurryrecipe();
	}
	public void rottenCurryrecipe() {
		state.rottenCurryrecipe();
	}
	public void newCurryrecipe() {
		state.newCurryrecipe();
	}


}
