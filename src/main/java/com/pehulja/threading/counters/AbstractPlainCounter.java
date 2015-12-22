package com.pehulja.threading.counters;

public abstract class AbstractPlainCounter implements Counter {
	protected int counter = 0;

	@Override
	public int getValue() {
		return counter;
	}
}
