package com.pehulja.threading.counters;

public class PlainCounter extends AbstractPlainCounter{

	@Override
	public int incrementAndGet() {
		return ++counter;
	}
}