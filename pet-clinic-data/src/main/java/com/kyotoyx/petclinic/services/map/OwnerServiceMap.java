package com.kyotoyx.petclinic.services.map;

import com.kyotoyx.petclinic.model.Owner;
import com.kyotoyx.petclinic.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {
    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }
}
