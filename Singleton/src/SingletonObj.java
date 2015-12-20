
public class SingletonObj {
	private SingletonObj() {

	}

	private static SingletonObj mSingletonObj;

	public static SingletonObj getInstance() {
		if (mSingletonObj == null) {
			mSingletonObj = new SingletonObj();
		}
		return mSingletonObj;
	}

	public void doSomething() {

	}
}
