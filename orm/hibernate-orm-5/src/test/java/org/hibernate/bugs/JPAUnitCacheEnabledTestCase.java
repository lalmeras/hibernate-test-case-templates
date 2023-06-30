package org.hibernate.bugs;

import java.util.Map;

import javax.persistence.Persistence;
import javax.persistence.SharedCacheMode;

import org.junit.Before;

/**
 * This template demonstrates how to develop a test case for Hibernate ORM, using the Java Persistence API.
 */
public class JPAUnitCacheEnabledTestCase extends AbstractJPAUnitTestCase {

	@Before
	public void init() {
		entityManagerFactory = Persistence.createEntityManagerFactory(
				"templatePU",
				Map.of("javax.persistence.sharedCache.mode", SharedCacheMode.ENABLE_SELECTIVE)
		);
	}

}
