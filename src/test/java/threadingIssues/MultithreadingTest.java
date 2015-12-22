package threadingIssues;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.pehulja.threading.Multithreading;
import com.pehulja.threading.Result;
import com.pehulja.threading.counters.AtomicCounter;
import com.pehulja.threading.counters.plain.PlainCounter;
import com.pehulja.threading.counters.plain.SynchronizedFieldPlainCounter;
import com.pehulja.threading.counters.plain.SynchronizedMethodPlainCounter;

public class MultithreadingTest {
	private Multithreading job;

	private final int THREAD_NUMBER = 100;
	private final int ITERATIONS_NUMBER = 100000;

	private long startPoint;
	private Result result;
	
	@Before
	public void before() {
		this.job = new Multithreading();
		this.startPoint = System.currentTimeMillis();
	}
	
	@After
	public void after(){
		System.out.println(result.toString() + "; time: " + (System.currentTimeMillis() - this.startPoint) + "ms");
		assertEquals(result.getExpected(), result.getActual());
	}

	@Test
	public void testPlainCounter() throws Exception {
		result = this.job.execute(THREAD_NUMBER, ITERATIONS_NUMBER, PlainCounter::new);
	}
	
	@Test
	public void testSyncFieldPlainCounter() throws Exception {
		result = this.job.execute(THREAD_NUMBER, ITERATIONS_NUMBER, SynchronizedFieldPlainCounter::new);
	}
	
	@Test
	public void testSyncMethodPlainCounter() throws Exception {
		result = this.job.execute(THREAD_NUMBER, ITERATIONS_NUMBER, SynchronizedMethodPlainCounter::new);
	}
	
	@Test
	public void testAtomicsCounter() throws Exception {
		result = this.job.execute(THREAD_NUMBER, ITERATIONS_NUMBER, AtomicCounter::new);
	}

}
