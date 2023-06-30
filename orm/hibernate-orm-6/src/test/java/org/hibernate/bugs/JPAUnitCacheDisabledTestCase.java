package org.hibernate.bugs;

import org.junit.Before;

import jakarta.persistence.Persistence;

/**
 * This template demonstrates how to develop a test case for Hibernate ORM, using the Java Persistence API.
 */
public class JPAUnitCacheDisabledTestCase extends AbstractJPAUnitTestCase {

	@Before
	public void init() {
		entityManagerFactory = Persistence.createEntityManagerFactory( "templatePU" );
	}
}
