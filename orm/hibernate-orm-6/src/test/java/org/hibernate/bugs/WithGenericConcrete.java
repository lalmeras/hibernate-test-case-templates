package org.hibernate.bugs;

import jakarta.persistence.Entity;

@Entity
public class WithGenericConcrete extends WithGenericAbstract<TargetEntityWithGeneric> {

}
