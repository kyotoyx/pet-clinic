package com.kyotoyx.petclinic.repositories;

import com.kyotoyx.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long>{
}
