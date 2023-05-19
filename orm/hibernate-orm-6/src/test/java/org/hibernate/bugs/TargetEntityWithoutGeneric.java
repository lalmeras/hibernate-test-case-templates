package org.hibernate.bugs;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class TargetEntityWithoutGeneric {

	@Id
	public Long id;

	@ManyToOne
	public WithoutGenericEntity withoutGeneric;

}
