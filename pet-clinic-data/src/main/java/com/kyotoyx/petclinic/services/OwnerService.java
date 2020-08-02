package com.kyotoyx.petclinic.services;

import com.kyotoyx.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
