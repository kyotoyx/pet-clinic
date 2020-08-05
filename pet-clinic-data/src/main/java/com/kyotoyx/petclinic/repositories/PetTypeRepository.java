package com.kyotoyx.petclinic.repositories;

import com.kyotoyx.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
