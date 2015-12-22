package com.pehulja.threading;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ThreadKeeper {
	private final Thread[] threads;
	private final int LIMIT;
	
	public ThreadKeeper(int LIMIT, Supplier<Runnable> supplier) {
		this.LIMIT = LIMIT;
		this.threads = new Thread[this.LIMIT];
		
		for(int i = 0; i < LIMIT; i++){
			this.threads[i] = new Thread(supplier.get());
		}
	}
	
	public void apply(Consumer<Thread> action){
		for(int i = 0; i < LIMIT; i++){
			action.accept(this.threads[i]);
		}
	}
}
