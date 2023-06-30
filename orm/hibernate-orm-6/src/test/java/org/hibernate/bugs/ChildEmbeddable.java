package org.hibernate.bugs;

import org.hibernate.annotations.Parent;

import jakarta.persistence.Embeddable;

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
