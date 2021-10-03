package state;

public class RottenState implements State {
	Curryrecipe curryrecipe;
	public RottenState(Curryrecipe curryrecipe) {
		this.curryrecipe = curryrecipe;
	}

	@Override
	public void newCurryrecipe() {
		System.out.println("new curry is prepared");

	}

	@Override
	public void rottenCurryrecipe() {
		System.out.println("new curry is good");

	}

	@Override
	public void burntCurryrecipe() {
		System.out.println("curry should be replaced");
		curryrecipe.setState(curryrecipe.getBurntState());
	}
}
