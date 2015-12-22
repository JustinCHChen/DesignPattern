abstract class GeneralWorker {
	public void doSomething() {
		doFirstThing();
		doSecondThing();
		doThridThing();

	}

	protected void doFirstThing() {
		// TODO Auto-generated method stub
		System.out.println("General doFirstThing");
	}

	abstract void doSecondThing();

	abstract void doThridThing();
}

abstract class NewWorker extends GeneralWorker {

	@Override
	protected void doSecondThing() {
		// TODO Auto-generated method stub
		System.out.println("NewWorker doSecondThing");
	}
}

class OldWorker extends NewWorker {

	@Override
	protected void doFirstThing() {
		// TODO Auto-generated method stub
		System.out.println("OldWorker doFirstThing");
		super.doFirstThing();
	}

	@Override
	protected void doThridThing() {
		// TODO Auto-generated method stub
		System.out.println("OldWorker doThridThing");
	}

}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OldWorker oldWorker = new OldWorker();
		oldWorker.doSomething();
	}

}
