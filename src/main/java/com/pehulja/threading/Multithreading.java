package com.pehulja.threading;

import java.util.function.Supplier;

import com.pehulja.threading.counters.Counter;

public class Multithreading {
	
	public Result execute(final int THREADS_NUMBER, final int ITERATIONS, Supplier<Counter> counterImpl) throws Exception {
		final Counter counter = counterImpl.get();
		
		ThreadKeeper threadKeeper = new ThreadKeeper(THREADS_NUMBER, () -> {
			return new IncrementalJob(counter, ITERATIONS);
		});

		threadKeeper.apply(Thread::start);

		threadKeeper.apply((thread) -> {
			try {
				thread.join();
			} catch (Exception e) {
			}
		});

		threadKeeper.apply((thread) -> {
			try {
				thread.join();
			} catch (Exception e) {
			}
		});
		
		return new Result(THREADS_NUMBER * ITERATIONS, counter.getValue(), counter.getClass());
	}
}
