package com.pehulja.threading.counters;

public class SynchronizedMethodPlainCounter extends AbstractPlainCounter{
	private int counter = 0;

	@Override
	public synchronized int incrementAndGet() {
		return ++counter;
	}
}