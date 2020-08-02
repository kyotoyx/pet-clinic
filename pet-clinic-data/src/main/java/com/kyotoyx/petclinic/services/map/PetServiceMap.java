package com.kyotoyx.petclinic.services.map;

import com.kyotoyx.petclinic.model.Pet;
import com.kyotoyx.petclinic.services.PetService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }
}
