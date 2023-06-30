package org.hibernate.bugs;

import javax.persistence.Embeddable;

import org.hibernate.annotations.Parent;

@Embeddable
public class ChildEmbeddable {

	@Parent
	public ParentEntity parent;

	public String field;

	public ParentEntity getParent() {
		return parent;
	}

	public void setParent(ParentEntity parent) {
		this.parent = parent;
	}

}
