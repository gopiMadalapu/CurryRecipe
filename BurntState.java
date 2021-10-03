package state;

public class BurntState implements State {
	Curryrecipe curryrecipe;
	public BurntState(Curryrecipe curryrecipe) {
		this.curryrecipe = curryrecipe;
	}

	@Override
	public void newCurryrecipe() {
		System.out.println("new curry should be made");

	}


	@Override
	public void rottenCurryrecipe() {
		System.out.println("curry should be replaced");
		curryrecipe.setState(curryrecipe.getRottenState());

	}

	@Override
	public void burntCurryrecipe() {
		System.out.println("curry is burnt");

	}

}
