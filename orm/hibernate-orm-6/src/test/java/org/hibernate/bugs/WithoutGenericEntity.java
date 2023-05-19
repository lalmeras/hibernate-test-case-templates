package org.hibernate.bugs;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderColumn;

@Entity
public class WithoutGenericEntity {

	@Id
	public Long id;

	@OneToMany(mappedBy = "withoutGeneric")
	@OrderColumn
	public List<TargetEntityWithoutGeneric> targets;

}
