package com.kyotoyx.petclinic.services.map;

import com.kyotoyx.petclinic.model.Specialty;
import com.kyotoyx.petclinic.model.Vet;
import com.kyotoyx.petclinic.services.SpecialtyService;
import com.kyotoyx.petclinic.services.VetService;
import org.springframework.stereotype.Service;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {


    private final SpecialtyService specialtyService;

    public VetMapService(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Vet save(Vet object) {
        if (object != null) {

            if (object.getSpecialties() != null) {
                object.getSpecialties().forEach(specialty -> {
                    if (specialty.getId() == null) {
                        Specialty savedSpecialty = specialtyService.save(specialty);
                        specialty.setId(savedSpecialty.getId());
                    }
                });
            }

            return super.save(object);
        } else {
            return null;
        }
    }
}
