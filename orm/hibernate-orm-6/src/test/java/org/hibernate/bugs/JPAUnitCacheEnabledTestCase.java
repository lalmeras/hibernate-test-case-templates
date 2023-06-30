package org.hibernate.bugs;

import java.util.Map;

import org.junit.Before;

import jakarta.persistence.Persistence;
import jakarta.persistence.SharedCacheMode;

/**
 * This template demonstrates how to develop a test case for Hibernate ORM, using the Java Persistence API.
 */
public class JPAUnitCacheEnabledTestCase extends AbstractJPAUnitTestCase {

	@Before
	public void init() {
		entityManagerFactory = Persistence.createEntityManagerFactory(
				"templatePU",
				Map.of("jakarta.persistence.sharedCache.mode", SharedCacheMode.ENABLE_SELECTIVE)
		);
	}
}
