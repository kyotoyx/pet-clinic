package com.kyotoyx.petclinic.repositories;

import com.kyotoyx.petclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
