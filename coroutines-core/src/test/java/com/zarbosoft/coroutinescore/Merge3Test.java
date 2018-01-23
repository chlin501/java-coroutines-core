package com.zarbosoft.coroutinescore;

/**
 * @author Matthias Mann
 */
public class Merge3Test implements CoroutineProto {

	public boolean a;
	public boolean b;

	public void run() throws SuspendExecution {
		if (a) {
			final Object[] arr = new Object[2];
			System.out.println(arr);
		} else {
			final float[] arr = new float[3];
			System.out.println(arr);
		}
		blub();
		System.out.println();
	}

	private void blub() throws SuspendExecution {
	}

	@org.junit.Test
	public void testMerge3() {
		final Coroutine c = new Coroutine(new Merge3Test());
		c.run();
	}
}