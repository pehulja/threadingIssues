package com.pehulja.threading.counters.plain;

import com.pehulja.threading.counters.Counter;

public abstract class AbstractPlainCounter implements Counter {
	protected int counter = 0;

	@Override
	public int getValue() {
		return counter;
	}
}
