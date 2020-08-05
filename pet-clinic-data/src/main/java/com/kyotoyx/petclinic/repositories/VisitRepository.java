package com.kyotoyx.petclinic.repositories;

import com.kyotoyx.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
