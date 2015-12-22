package com.pehulja.threading.counters.plain;

public class SynchronizedMethodPlainCounter extends AbstractPlainCounter{
	@Override
	public synchronized long incrementAndGet() {
		return ++counter;
	}
}