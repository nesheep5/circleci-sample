package jp.sample;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testSeyHello() throws Exception {
		// throw new RuntimeException("not yet implemented");
		Assert.assertEquals("Hello World!!", new HelloWorld().seyHello());
	}

}
