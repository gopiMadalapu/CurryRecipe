package state;

public class NewState implements State {
	Curryrecipe curryrecipe;
	public NewState(Curryrecipe curryrecipe) {
		this.curryrecipe = curryrecipe;
	}

	@Override
	public void newCurryrecipe() {
		System.out.println("new curryrecipe is prepared");
		
	}


	@Override
	public void rottenCurryrecipe() {
		System.out.println("curry is rotten");
		curryrecipe.setState(curryrecipe.getRottenState());
		
	}

	@Override
	public void burntCurryrecipe() {
		System.out.println("new curry is to be made");
		curryrecipe.setState(curryrecipe.getBurntState());

	}


}
