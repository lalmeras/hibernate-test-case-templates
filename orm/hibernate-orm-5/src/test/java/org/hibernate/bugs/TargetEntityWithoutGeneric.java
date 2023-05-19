package org.hibernate.bugs;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TargetEntityWithoutGeneric {

	@Id
	public Long id;

	@ManyToOne
	public WithoutGenericEntity withoutGeneric;

}
