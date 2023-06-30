package org.hibernate.bugs;

import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Test;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public abstract class AbstractJPAUnitTestCase {

	protected EntityManagerFactory entityManagerFactory;

	public AbstractJPAUnitTestCase() {
		super();
	}

	@After
	public void destroy() {
		entityManagerFactory.close();
	}

	@Test
	public void hhh16879Test() throws Exception {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		ParentEntity p = new ParentEntity();
		p.child = new ChildEmbeddable();
		p.child.field = "value";
		p.child.setParent(p);
		entityManager.persist(p);
		entityManager.getTransaction().commit();
		entityManager.close();
		
		entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		ParentEntity loaded = entityManager.find(ParentEntity.class, p.id);
		Assertions.assertThat(loaded.child.parent).isNotNull();
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}