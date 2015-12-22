package threadingIssues;

import org.junit.Before;
import org.junit.Test;

import com.pehulja.threading.Multithreading;
import com.pehulja.threading.Result;
import com.pehulja.threading.counters.PlainCounter;
import static org.junit.Assert.*;

public class MultithreadingTest {
	private Multithreading job;

	private final int THREAD_NUMBER = 10;
	private final int ITERATIONS_NUMBER = 2000;

	@Before
	public void before() {
		this.job = new Multithreading();
	}

	@Test
	public void testPlainCounter() throws Exception {
		Result result = this.job.execute(THREAD_NUMBER, ITERATIONS_NUMBER, PlainCounter::new);
		System.out.println(result.toString());

		assertEquals(result.getExpected(), result.getActual());
	}

}
