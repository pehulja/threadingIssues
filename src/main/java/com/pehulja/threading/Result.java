package com.pehulja.threading;

public class Result {
	private final int expected;
	private final int actual;
	
	public Result(int expected, int actual) {
		super();
		this.expected = expected;
		this.actual = actual;
	}

	public int getExpected() {
		return expected;
	}

	public int getActual() {
		return actual;
	}

	@Override
	public String toString() {
		return "Result [expected=" + expected + ", actual=" + actual + "]";
	}
}
