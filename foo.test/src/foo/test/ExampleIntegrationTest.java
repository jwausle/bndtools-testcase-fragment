package foo.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.osgi.framework.FrameworkUtil;

import foo.Example;
//import foo.internal.InternalExample;
import foo.internal.InternalExample;

@RunWith(MockitoJUnitRunner.class)
public class ExampleIntegrationTest {
	
	@Before
	public void before() {
		System.out.println("==> BEFORE " + getClass());
	}

	@After
	public void after() {
		System.out.println("<== AFTER " + getClass());
	}

	@Test
	public void testExample() {
		FrameworkUtil.getBundle(Example.class).getBundleContext();
		FrameworkUtil.getBundle(InternalExample.class).getBundleContext();
		System.out.println("    testing ... ");
	}

}