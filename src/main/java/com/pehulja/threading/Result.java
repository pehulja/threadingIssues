package com.pehulja.threading;

import com.pehulja.threading.counters.Counter;

public class Result {
	private final long expected;
	private final long actual;
	private String counterClass;
	
	public Result(long expected, long actual, Class<? extends Counter> clazz) {
		super();
		this.expected = expected;
		this.actual = actual;
		this.counterClass = clazz.getSimpleName();
	}

	public long getExpected() {
		return expected;
	}

	public long getActual() {
		return actual;
	}

	@Override
	public String toString() {
		return "Result [expected=" + expected + ", actual=" + actual + ", counterClass=" + counterClass + "]";
	}
}
