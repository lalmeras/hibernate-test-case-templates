package org.hibernate.bugs;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

@Entity
public class WithoutGenericEntity {

	@Id
	public Long id;

	@OneToMany(mappedBy = "withoutGeneric")
	@OrderColumn
	public List<TargetEntityWithoutGeneric> targets;

}
