package threadingIssues;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Supplier;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.pehulja.threading.Multithreading;
import com.pehulja.threading.Result;
import com.pehulja.threading.counters.AtomicCounter;
import com.pehulja.threading.counters.Counter;
import com.pehulja.threading.counters.plain.PlainCounter;
import com.pehulja.threading.counters.plain.SynchronizedFieldPlainCounter;
import com.pehulja.threading.counters.plain.SynchronizedMethodPlainCounter;

@RunWith(value = Parameterized.class)
public class MultithreadingTest {
	private Multithreading job;
	private Supplier<? extends Counter> counterImplementation;
	
	private final static int THREAD_NUMBER = 100;
	private final static int ITERATIONS_NUMBER = 100000;

	private long startPoint;
	private Result result;
	
	@Parameters
	public static Collection<Supplier<? extends Counter>> getImplementations(){
		return Arrays.asList(PlainCounter::new, SynchronizedFieldPlainCounter::new, SynchronizedMethodPlainCounter::new, AtomicCounter::new);
	}
	
	public MultithreadingTest(Supplier<? extends Counter> counterImplementation) {
		super();
		this.counterImplementation = counterImplementation;
	}
	
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
	public void test() throws Exception {
		result = this.job.execute(THREAD_NUMBER, ITERATIONS_NUMBER, this.counterImplementation);
	}
}
