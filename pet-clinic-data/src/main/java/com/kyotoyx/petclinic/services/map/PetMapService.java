package com.kyotoyx.petclinic.services.map;

import com.kyotoyx.petclinic.model.Pet;
import com.kyotoyx.petclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }
}
