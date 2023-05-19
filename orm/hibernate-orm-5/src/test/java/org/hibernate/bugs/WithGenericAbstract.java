package org.hibernate.bugs;

import java.util.List;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

@MappedSuperclass
public abstract class WithGenericAbstract<T extends TargetEntityWithGeneric> {

	@Id
	public Long id;

	@OneToMany(mappedBy="withGeneric")
	@OrderColumn
	public List<T> targets;

}
