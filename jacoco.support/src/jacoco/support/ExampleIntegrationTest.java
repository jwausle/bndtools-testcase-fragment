package jacoco.support;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;

@RunWith(MockitoJUnitRunner.class)
public class ExampleIntegrationTest {

	private final BundleContext context = FrameworkUtil.getBundle(ExampleIntegrationTest.class).getBundleContext();

	@Before
	public void before() {
		Assert.assertNotNull(context);
	}

	@After
	public void after() {
		Assert.assertNotNull(context);
	}

	@Test
	public void testExample() {
		Assert.assertTrue(true);
	}

}