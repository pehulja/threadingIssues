package com.pehulja.threading;

import com.pehulja.threading.counters.Counter;

class IncrementalJob implements Runnable {
	private final Counter counter;
	private final long iterations;
	public IncrementalJob(Counter counter, long iterations) {
		this.counter = counter;
		this.iterations = iterations;
	}

	@Override
	public void run() {
		for(long i = 0; i < this.iterations; i++) {
			this.counter.incrementAndGet();
		}
	}
}