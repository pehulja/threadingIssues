package com.pehulja.threading;

import com.pehulja.threading.counters.Counter;

public class Result {
	private final int expected;
	private final int actual;
	private String counterClass;
	
	public Result(int expected, int actual, Class<? extends Counter> clazz) {
		super();
		this.expected = expected;
		this.actual = actual;
		this.counterClass = clazz.getSimpleName();
	}

	public int getExpected() {
		return expected;
	}

	public int getActual() {
		return actual;
	}

	@Override
	public String toString() {
		return "Result [expected=" + expected + ", actual=" + actual + ", counterClass=" + counterClass + "]";
	}
}
