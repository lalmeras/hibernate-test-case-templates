package org.hibernate.bugs;

import javax.persistence.Entity;

@Entity
public class WithGenericConcrete extends WithGenericAbstract<TargetEntityWithGeneric> {

}
