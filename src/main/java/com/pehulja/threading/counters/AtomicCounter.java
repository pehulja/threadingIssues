package com.pehulja.threading.counters;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter implements Counter {
	private AtomicInteger counter = new AtomicInteger();

	@Override
	public int incrementAndGet() {
		return this.counter.incrementAndGet();
	}

	@Override
	public int getValue() {
		return this.counter.get();
	}
}