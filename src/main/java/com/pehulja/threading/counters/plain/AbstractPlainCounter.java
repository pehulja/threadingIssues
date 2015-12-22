package com.pehulja.threading.counters.plain;

import com.pehulja.threading.counters.Counter;

public abstract class AbstractPlainCounter implements Counter {
	protected long counter = 0;

	@Override
	public long getValue() {
		return counter;
	}
}
