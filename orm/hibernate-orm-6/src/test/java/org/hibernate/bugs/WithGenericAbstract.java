package org.hibernate.bugs;

import java.util.List;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderColumn;

@MappedSuperclass
public abstract class WithGenericAbstract<T extends TargetEntityWithGeneric> {

	@Id
	public Long id;

	@OneToMany(mappedBy="withGeneric")
	@OrderColumn
	public List<T> targets;

}
