package com.pehulja.threading.counters.plain;

public class SynchronizedFieldPlainCounter extends AbstractPlainCounter{
	@Override
	public long incrementAndGet() {
		long value = 0;
		synchronized (this) {
			value = ++counter;
		}
		return value;
	}
}