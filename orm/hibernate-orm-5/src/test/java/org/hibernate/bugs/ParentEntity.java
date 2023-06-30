package org.hibernate.bugs;

import javax.persistence.Cacheable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Cacheable
public class ParentEntity {

	@Id
	@GeneratedValue
	public Long id;

	@Embedded
	public ChildEmbeddable child;

}
