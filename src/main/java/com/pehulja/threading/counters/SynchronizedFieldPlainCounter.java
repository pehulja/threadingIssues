package com.pehulja.threading.counters;

public class SynchronizedFieldPlainCounter extends AbstractPlainCounter{
	private int counter = 0;
	@Override
	public int incrementAndGet() {
		int value = 0;
		synchronized (this) {
			value = ++counter;
		}
		return value;
	}
}