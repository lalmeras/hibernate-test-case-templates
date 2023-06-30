package org.hibernate.bugs;

import javax.persistence.Persistence;

import org.junit.Before;

/**
 * This template demonstrates how to develop a test case for Hibernate ORM, using the Java Persistence API.
 */
public class JPAUnitCacheDisabledTestCase extends AbstractJPAUnitTestCase {

	@Before
	public void init() {
		entityManagerFactory = Persistence.createEntityManagerFactory( "templatePU" );
	}

}
