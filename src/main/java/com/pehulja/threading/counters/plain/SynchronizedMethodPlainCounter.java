package com.pehulja.threading.counters.plain;

public class SynchronizedMethodPlainCounter extends AbstractPlainCounter{
	@Override
	public synchronized int incrementAndGet() {
		return ++counter;
	}
}