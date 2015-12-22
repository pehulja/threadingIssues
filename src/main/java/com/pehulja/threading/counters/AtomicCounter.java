package com.pehulja.threading.counters;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicCounter implements Counter {
	private AtomicLong counter = new AtomicLong();

	@Override
	public long incrementAndGet() {
		return this.counter.incrementAndGet();
	}

	@Override
	public long getValue() {
		return this.counter.get();
	}
}