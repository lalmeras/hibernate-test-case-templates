package org.hibernate.bugs;

import jakarta.persistence.Cacheable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
@Cacheable
public class ParentEntity {

	@Id
	@GeneratedValue
	public Long id;

	@Embedded
	public ChildEmbeddable child;

}
