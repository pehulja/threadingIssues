package com.pehulja.threading.counters.plain;

public class PlainCounter extends AbstractPlainCounter{

	@Override
	public long incrementAndGet() {
		return ++counter;
	}
}