package com.kyotoyx.petclinic.services;

import com.kyotoyx.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save(Vet o);
    Set<Vet> findAll();
}
