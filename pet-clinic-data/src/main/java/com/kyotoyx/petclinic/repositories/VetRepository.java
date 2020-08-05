package com.kyotoyx.petclinic.repositories;

import com.kyotoyx.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
